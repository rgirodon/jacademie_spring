package org.jacademie.tdspring.service.impl;

import java.util.Collection;

import org.apache.log4j.Logger;
import org.jacademie.tdspring.dao.ClientDao;
import org.jacademie.tdspring.domain.Client;
import org.jacademie.tdspring.service.ClientService;

public class ClientServiceImpl implements ClientService {

	private static Logger logger = Logger.getLogger(ClientServiceImpl.class);
	
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
		
		return this.clientDao.findAllClients();
	}

}
