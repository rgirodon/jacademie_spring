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
public class App 
{
	
	private static Logger logger = Logger.getLogger(App.class);
	
    public static void main( String[] args ) {
       
    	logger.info("Loading context...");
    	
    	ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	logger.info("Context loaded.");
    	
    	logger.info("Retrieving service...");
    	
    	ClientService service = appContext.getBean("clientService",	ClientService.class);
    	
    	logger.info("Service retrieved.");
    	
    	logger.info("Calling service...");
    	
    	Collection<Client> clients = service.findAllClients();
    	
    	logger.info("Service called.");
    	
    	logger.info(clients.size() + " clients found.");
    	
    	for (Client client : clients) {
    		
    		logger.info("Client found : " + client);
    	}
    }
}
