package org.jacademie.tdspring.service.impl;

import org.apache.log4j.Logger;
import org.jacademie.tdspring.service.EditionService;
import org.springframework.stereotype.Component;

@Component("editionService")
public class EditionServiceImpl implements EditionService {

	private static Logger logger = Logger.getLogger(EditionServiceImpl.class);
	
	@Override
	public void lancerEditions() {
		
		logger.info("Lancer les éditions...");
	}

}
