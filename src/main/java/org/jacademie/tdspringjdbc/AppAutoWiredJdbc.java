package org.jacademie.tdspringjdbc;

import java.sql.Connection;
import java.util.Collection;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.jacademie.tdspring.domain.PersonnePhysique;
import org.jacademie.tdspring.domain.Student;
import org.jacademie.tdspring.service.PersonnePhysiqueService;
import org.jacademie.tdspring.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class AppAutoWiredJdbc 
{
	
	private static Logger logger = Logger.getLogger(AppAutoWiredJdbc.class);
	
    public static void main( String[] args ) {
       
    	logger.info("Loading context...");
    	
    	ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContextAutowiredJdbc.xml");
    	
    	logger.info("Context loaded.");
    	
    	PersonnePhysiqueService personnePhysiqueService = appContext.getBean("personnePhysiqueService", PersonnePhysiqueService.class);
    	
    	PersonnePhysique personnePhysique = personnePhysiqueService.findPersonnePhysiqueByNrc("11046187");
    	
    	logger.info("Retrieved personnePhysique : " + personnePhysique);
    	
    	/*
    	logger.info("Retrieving service...");
    	
    	StudentService service = appContext.getBean("studentService", StudentService.class);
    	
    	logger.info("Service retrieved.");
    	
    	logger.info("Calling service...");
    	
    	Student student = service.findStudentByNum(1);
    	
    	logger.info("Service called.");
    	
    	logger.info("Student found : " + student);
    	
    	logger.info("Calling service...");
    	
    	Collection<Student> students = service.findStudentsByName("Maxime");
    	
    	logger.info("Service called.");
    	
    	logger.info("Students found : " + students);
    	
    	logger.info("Creating service...");
    	
    	Student newStudent = new Student();
    	newStudent.setName("Jun");
    	
    	service.createStudent(newStudent);
    	
    	logger.info("Student created.");
    	
    	logger.info("Students found : " + students);
    	*/
    	
    }
}
