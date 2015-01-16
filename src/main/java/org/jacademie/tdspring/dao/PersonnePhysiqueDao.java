package org.jacademie.tdspring.dao;

import java.util.Collection;

import org.jacademie.tdspring.domain.PersonnePhysique;

public interface PersonnePhysiqueDao {

	public PersonnePhysique findPersonnePhysiqueByNrc(String nrc);
	
	public void createPersonnePhysique(PersonnePhysique personnePhysique);

	public Collection<PersonnePhysique> findAllPersonnePhysiques();
}
