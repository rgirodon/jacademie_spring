package org.jacademie.tdspring;

import java.util.Collection;

import org.apache.log4j.Logger;
import org.jacademie.tdspring.domain.Client;
import org.jacademie.tdspring.service.ClientService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class AppAutoWired 
{
	
	private static Logger logger = Logger.getLogger(AppAutoWired.class);
	
    public static void main( String[] args ) {
       
    	logger.info("Loading context...");
    	
    	ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContextAutowired.xml");
    	
    	logger.info("Context loaded.");
    	
    	logger.info("Retrieving service...");
    	
    	ClientService service = appContext.getBean("clientService",	ClientService.class);
    	
    	logger.info("Service retrieved.");
    	
    	logger.info("Calling service...");
    	
    	Collection<Client> clients = service.findAllClients();
    	
    	logger.info("Service called.");
    	
    	logger.info(clients.size() + " clients found.");
    }
}
