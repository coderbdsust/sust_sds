package edu.sust.sust_sd.dao;

import java.util.List;

import edu.sust.sust_sd.domain.Student;

public interface IStudentDao {
	
	public boolean save(Student student);
	public boolean update(Student student);
	public List<Student> getStudents();
	public Student getStudentById(Student student);
	public boolean deleteStudentById(Student studentId);

}
