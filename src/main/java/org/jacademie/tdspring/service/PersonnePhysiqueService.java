package org.jacademie.tdspring.service;

import java.util.Collection;

import org.jacademie.tdspring.domain.PersonnePhysique;

public interface PersonnePhysiqueService {

	public PersonnePhysique findPersonnePhysiqueByNrc(String nrc);
	
	public void createPersonnePhysique(PersonnePhysique personnePhysique);
	
	public void createPersonnePhysiques(Collection<PersonnePhysique> personnePhysiques);
	
	public Collection<PersonnePhysique> findAllPersonnePhysiques();
}
