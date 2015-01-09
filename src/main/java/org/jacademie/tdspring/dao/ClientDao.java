package org.jacademie.tdspring.dao;

import java.util.Collection;

import org.jacademie.tdspring.domain.Client;

public interface ClientDao {

	public Collection<Client> findAllClients();
}
