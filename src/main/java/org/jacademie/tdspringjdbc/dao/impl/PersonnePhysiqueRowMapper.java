package org.jacademie.tdspringjdbc.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.jacademie.tdspring.domain.PersonnePhysique;
import org.springframework.jdbc.core.RowMapper;

public class PersonnePhysiqueRowMapper implements RowMapper<PersonnePhysique> {

	@Override
	public PersonnePhysique mapRow(ResultSet rs, int cpt)
			throws SQLException {
		
		PersonnePhysique result = new PersonnePhysique(
										rs.getLong("ID"),
										rs.getString("NO_REL_CLT"),
										rs.getString("NOM_USAGE"),
										rs.getString("PRENOM"));
		
		return result;
	}

}
