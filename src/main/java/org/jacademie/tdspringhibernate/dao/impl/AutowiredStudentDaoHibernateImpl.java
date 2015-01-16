package org.jacademie.tdspringhibernate.dao.impl;

import java.util.Collection;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.jacademie.tdspring.dao.StudentDao;
import org.jacademie.tdspring.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository(value="studentDaoHibernate")
public class AutowiredStudentDaoHibernateImpl implements StudentDao {

	private static Logger logger = Logger.getLogger(AutowiredStudentDaoHibernateImpl.class);
	
	@Autowired
	private SessionFactory sessionFactory;
	
	/* (non-Javadoc)
	 * @see org.jacademie.tdspring.dao.StudentDao#findStudentByNum(java.lang.Integer)
	 */
	public Student findStudentByNum(Integer num) {
		
		logger.info("In findStudentByNum");
		
		Student result = (Student)this.sessionFactory.getCurrentSession().get(Student.class, num);
		
		logger.info("Out of findStudentByNum");
		
		return result;
	}
	
	/* (non-Javadoc)
	 * @see org.jacademie.tdspring.dao.StudentDao#findStudentsByName(java.lang.String)
	 */
	public Collection<Student> findStudentsByName(String name) {
		
		logger.info("In findStudentsByName");
		
		String param = "%" + name.toUpperCase() + "%";
		
		Query query = this.sessionFactory.getCurrentSession().createQuery("FROM Student WHERE UPPER(name) LIKE :param");
		query.setString("param", param);
		
		Collection<Student> result = query.list();
		
		logger.info("Out of findStudentsByName");
		
		return result;
	}

	@Override
	public void createStudent(Student student) {
		
		logger.info("In createStudent");
		
		this.sessionFactory.getCurrentSession().save(student);
		
		logger.info("Out of createStudent");
	}
}
