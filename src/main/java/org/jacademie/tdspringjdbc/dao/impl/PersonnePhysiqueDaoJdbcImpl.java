package org.jacademie.tdspringjdbc.dao.impl;

import java.util.Collection;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.jacademie.tdspring.dao.PersonnePhysiqueDao;
import org.jacademie.tdspring.domain.PersonnePhysique;
import org.jacademie.tdspring.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PersonnePhysiqueDaoJdbcImpl implements PersonnePhysiqueDao {

	private static Logger logger = Logger.getLogger(PersonnePhysiqueDaoJdbcImpl.class);
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public PersonnePhysique findPersonnePhysiqueByNrc(String nrc) {
		
		logger.info("In findPersonnePhysiqueByNrc");
		
		String sql = "SELECT ID, NO_REL_CLT, NOM_USAGE, PRENOM FROM AA_CRIT_PPHYS WHERE NO_REL_CLT = ?";
		
		String[] params = {nrc};
		
		PersonnePhysique result = this.jdbcTemplate.queryForObject(sql, 
																	params, 
																	new PersonnePhysiqueRowMapper());
		
		logger.info("Out of findPersonnePhysiqueByNrc");
		
		return result;
	}

	@Override
	public void createPersonnePhysique(PersonnePhysique personnePhysique) {
		
		logger.info("In createPersonnePhysique");
		
		String sql = "INSERT INTO AA_CRIT_PPHYS (NO_REL_CLT, NOM_USAGE, PRENOM) VALUES (?,?,?)";
		
		this.jdbcTemplate.update(sql,
									personnePhysique.getNrc(),
									personnePhysique.getNomUsage(),
									personnePhysique.getPrenom());
		
		logger.info("Out of createPersonnePhysique");
	}

	@Override
	public Collection<PersonnePhysique> findAllPersonnePhysiques() {
		
		logger.info("In findAllPersonnePhysiques");
		
		String sql = "SELECT ID, NO_REL_CLT, NOM_USAGE, PRENOM FROM AA_CRIT_PPHYS ORDER BY NO_REL_CLT";
		
		Collection<PersonnePhysique> result = this.jdbcTemplate.query(sql,  
																		new PersonnePhysiqueRowMapper());
		
		logger.info("Out of findAllPersonnePhysiques");
		
		return result;
	}
}
