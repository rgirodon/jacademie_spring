package org.jacademie.tdspring;

import junit.framework.Assert;

import org.jacademie.tdspring.dao.ClientDao;
import org.jacademie.tdspring.service.ClientService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class AppTest {

	@Autowired
	private ClientService clientService;
	
	@Autowired
	private ClientDao clientDao;
	
	@Test
	public void testServiceFindAllClients() {
		
		Assert.assertEquals(3, this.clientService.findAllClients().size());
	}
	
	@Test
	public void testDaoFindAllClients() {
		
		Assert.assertEquals(3, this.clientDao.findAllClients().size());
	}
}
