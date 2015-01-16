package org.jacademie.tdspringhibernate;

import java.util.Collection;

import org.apache.log4j.Logger;
import org.jacademie.tdspring.domain.Student;
import org.jacademie.tdspring.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class AppAutoWiredHibernate 
{
	
	private static Logger logger = Logger.getLogger(AppAutoWiredHibernate.class);
	
    public static void main( String[] args ) {
       
    	logger.info("Loading context...");
    	
    	ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContextAutowiredHibernate.xml");
    	
    	logger.info("Context loaded.");
    	
    	logger.info("Retrieving service...");
    	
    	StudentService service = appContext.getBean("studentService", StudentService.class);
    	
    	logger.info("Service retrieved.");
    	
    	
    	logger.info("Calling service...");
    	
    	Student student = new Student();
    	student.setName("Prenom2 Nom2");
    	service.createStudent(student);
    	
    	logger.info("Service called.");
    	
    	Student student1 = service.findStudentByNum(1);
    	if (student1 != null) {
    		
    		logger.info("Found student 1 : " + student1);
    	}
    	else {
    		logger.info("Student 1 not found");
    	}
    	
    	/*
    	logger.info("Calling service...");
    	
    	Student student = service.findStudentByNum(1);
    	
    	logger.info("Service called.");
    	
    	logger.info("Student found : " + student);
    	*/
    	
    	/*
    	logger.info("Calling service...");
    	
    	Collection<Student> students = service.findStudentsByName("bu");
    	
    	logger.info("Service called.");
    	
    	logger.info("Students found : " + students);   
    	*/ 	
    }
}
