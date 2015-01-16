package org.jacademie.tdspringhibernate.service.impl;

import java.util.Collection;

import org.apache.log4j.Logger;
import org.jacademie.tdspring.dao.StudentDao;
import org.jacademie.tdspring.domain.Student;
import org.jacademie.tdspring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service(value="studentService")
public class StudentServiceImpl implements StudentService {

	private static Logger logger = Logger.getLogger(StudentServiceImpl.class);
	
	@Autowired
	@Qualifier("studentDaoHibernate")
	private StudentDao studentDao;
	
	@Override
	@Transactional(readOnly=true)
	public Student findStudentByNum(Integer num) {
		
		logger.info("In findStudentByNum");
		
		Student result = this.studentDao.findStudentByNum(num);
		
		logger.info("Out of findStudentByNum");
		
		return result;
	}

	@Override
	@Transactional(readOnly=true)
	public Collection<Student> findStudentsByName(String name) {
		
		logger.info("In findStudentsByName");
		
		Collection<Student> result = this.studentDao.findStudentsByName(name);
		
		logger.info("Out of findStudentsByName");
		
		return result;
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void createStudent(Student student) {
		
		logger.info("In createStudent");
		
		this.studentDao.createStudent(student);
		
		logger.info("Out of createStudent");
	}
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public void createStudents(Collection<Student> students) {
		
		logger.info("In createStudents");
		
		for (Student student : students) {
		
			this.createStudent(student);
		}
		
		logger.info("Out of createStudents");
	}
}
