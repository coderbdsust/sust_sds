package edu.sust.sust_sd.test;

import java.util.List;

import edu.sust.sust_sd.dao.IStudentDao;
import edu.sust.sust_sd.dao.impl.StudentDao;
import edu.sust.sust_sd.domain.Student;

public class AppTester {
	public static void main(String[] args) {
		IStudentDao studentDao = new StudentDao();
		List<Student> students = studentDao.getStudents();
		for (Student s : students) {
			System.out.println(s);
		}
//		studentDao.saveOrUpdateStudent(students.get(0));
//		studentDao.deleteStudentById(students.get(0));
		Student s = studentDao.getStudentById(new Student(6));
		System.out.println(s);
	}

}
