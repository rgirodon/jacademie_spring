package org.jacademie.tdspring.service.impl;

import java.util.Collection;

import org.apache.log4j.Logger;
import org.jacademie.tdspring.dao.ClientDao;
import org.jacademie.tdspring.domain.Client;
import org.jacademie.tdspring.service.ClientService;
import org.jacademie.tdspring.service.EditionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service(value="clientService")
public class AutowiredClientServiceImpl implements ClientService {

	private static Logger logger = Logger.getLogger(AutowiredClientServiceImpl.class);
	
	@Autowired
	private EditionService editionService;
	
	@Autowired
	private ClientDao clientDao;
	
	public ClientDao getClientDao() {
		return clientDao;
	}

	public void setClientDao(ClientDao clientDao) {
		this.clientDao = clientDao;
	}

	@Override
	public Collection<Client> findAllClients() {
		
		logger.info("In findAllClients");
		
		this.editionService.lancerEditions();
		
		return this.clientDao.findAllClients();
	}

}
