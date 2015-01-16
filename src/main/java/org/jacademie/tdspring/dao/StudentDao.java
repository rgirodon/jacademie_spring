package org.jacademie.tdspring.dao;

import java.util.Collection;

import org.jacademie.tdspring.domain.Student;

public interface StudentDao {

	/**
	 * Find student by num.
	 *
	 * @param num the num
	 * @return the student
	 */
	public Student findStudentByNum(Integer num); 
	
	/**
	 * Find students by name.
	 *
	 * @param name the name
	 * @return the collection
	 */
	public Collection<Student> findStudentsByName(String name);

	/**
	 * Creates the student.
	 *
	 * @param student the student
	 */
	public void createStudent(Student student);
}
