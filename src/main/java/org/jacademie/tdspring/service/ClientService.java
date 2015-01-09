package org.jacademie.tdspring.service;

import java.util.Collection;

import org.jacademie.tdspring.domain.Client;

public interface ClientService {

	public Collection<Client> findAllClients();
}
