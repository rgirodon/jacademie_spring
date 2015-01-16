package org.jacademie.tdspringjdbc.service.impl;

import java.util.Collection;

import org.jacademie.tdspring.dao.PersonnePhysiqueDao;
import org.jacademie.tdspring.domain.PersonnePhysique;
import org.jacademie.tdspring.service.PersonnePhysiqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("personnePhysiqueService")
public class PersonnePhysiqueServiceImpl implements PersonnePhysiqueService {

	@Autowired
	private PersonnePhysiqueDao personnePhysiqueDao;
	
	@Override
	public PersonnePhysique findPersonnePhysiqueByNrc(String nrc) {
		
		return this.personnePhysiqueDao.findPersonnePhysiqueByNrc(nrc);
	}

	@Override
	public void createPersonnePhysique(PersonnePhysique personnePhysique) {
		
		this.personnePhysiqueDao.createPersonnePhysique(personnePhysique);
	}
	
	@Override
	public void createPersonnePhysiques(Collection<PersonnePhysique> personnePhysiques) {
		
		for (PersonnePhysique personnePhysique : personnePhysiques) {
			
			this.createPersonnePhysique(personnePhysique);
		}
	}

	@Override
	public Collection<PersonnePhysique> findAllPersonnePhysiques() {
		
		return this.personnePhysiqueDao.findAllPersonnePhysiques();
	}
}
