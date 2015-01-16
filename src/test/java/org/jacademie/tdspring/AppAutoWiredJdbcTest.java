package org.jacademie.tdspring;

import junit.framework.Assert;

import org.jacademie.tdspring.dao.ClientDao;
import org.jacademie.tdspring.dao.PersonnePhysiqueDao;
import org.jacademie.tdspring.domain.PersonnePhysique;
import org.jacademie.tdspring.service.ClientService;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContextAutowiredJdbc.xml" })
public class AppAutoWiredJdbcTest {
	
	@Autowired
	private PersonnePhysiqueDao personnePhysiqueDao;
		
	@Test
	public void testDaoCreatePersonnePhysique() {
		
		PersonnePhysique personnePhysique = new PersonnePhysique("1", "NOM", "PRENOM");
		
		this.personnePhysiqueDao.createPersonnePhysique(personnePhysique);
		
		Assert.assertEquals("1", this.personnePhysiqueDao.findPersonnePhysiqueByNrc("1").getNrc());
	}
	
	@Test
	public void testDaoFindAllPersonnePhysiques() {
		
		Assert.assertFalse(this.personnePhysiqueDao.findAllPersonnePhysiques().isEmpty());
	}
}
