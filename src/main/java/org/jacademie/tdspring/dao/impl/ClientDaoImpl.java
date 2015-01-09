package org.jacademie.tdspring.dao.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.apache.log4j.Logger;
import org.jacademie.tdspring.dao.ClientDao;
import org.jacademie.tdspring.domain.Client;
import org.jacademie.tdspring.service.impl.ClientServiceImpl;

public class ClientDaoImpl implements ClientDao {

	private static Logger logger = Logger.getLogger(ClientDaoImpl.class);
	
	@Override
	public Collection<Client> findAllClients() {
		
		logger.info("In findAllClients");
		
		Collection<Client> result = new ArrayList<Client>();
		
		result.add(new Client("Client1"));
		result.add(new Client("Client2"));
		result.add(new Client("Client3"));
		
		return result;
	}
}
