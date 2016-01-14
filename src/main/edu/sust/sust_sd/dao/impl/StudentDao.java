package edu.sust.sust_sd.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;

import edu.sust.sust_sd.dao.IStudentDao;
import edu.sust.sust_sd.db.DbConnection;
import edu.sust.sust_sd.domain.Student;

/**
 * 
 * @author Biswajit Debnath
 *
 */
public class StudentDao implements IStudentDao {

	@Override
	public boolean save(Student student) {
		// TODO Auto-generated method stub
		String query = "insert into student (student_name, reg_no, cgpa) values(?,?,?)";
		Connection connection = DbConnection.getInstance().getConnection();
		try {
			PreparedStatement state = (PreparedStatement) connection
					.prepareStatement(query);
			state.setString(1, student.getStudentName());
			state.setInt(2, student.getRegNo());
			state.setDouble(3, student.getCgpa());
			return state.execute();
		} catch (Exception ex) {
			System.out.println("[INSERT STUDENT EXCEPTION] [" + ex.getMessage()
					+ "]");
			return false;
		}
	}

	@Override
	public boolean update(Student student) {
		// TODO Auto-generated method stub
		String query = "update student set student_name=? , reg_no=?, cgpa=? where student_id=?)";
		Connection connection = DbConnection.getInstance().getConnection();
		try {
			PreparedStatement state = (PreparedStatement) connection
					.prepareStatement(query);
			state.setString(1, student.getStudentName());
			state.setInt(2, student.getRegNo());
			state.setDouble(3, student.getCgpa());
			state.setDouble(4, student.getStudentId());
			return state.execute();
		} catch (Exception ex) {
			System.out.println("[INSERT STUDENT EXCEPTION] [" + ex.getMessage()
					+ "]");
			return false;
		}
	}

	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		List<Student> students = new ArrayList<Student>();
		String query = "select * from student";
		Connection connection = DbConnection.getInstance().getConnection();
		try {
			PreparedStatement state = (PreparedStatement) connection
					.prepareStatement(query);
			ResultSet rs = state.executeQuery();
			while (rs.next()) {
				Student student = new Student();
				student.setStudentId(rs.getInt("student_id"));
				student.setStudentName(rs.getString("student_name"));
				student.setRegNo(rs.getInt("reg_no"));
				student.setCgpa(rs.getDouble("cgpa"));
				students.add(student);
			}
		} catch (Exception ex) {
			System.out.println("[GET STUDENTS LIST EXCEPTION] ["
					+ ex.getMessage() + "]");
		}
		return students;
	}

	@Override
	public Student getStudentById(Student std) {
		Student student = new Student();
		String query = "select * from student where student_id=?";
		Connection connection = DbConnection.getInstance().getConnection();
		try {
			PreparedStatement state = (PreparedStatement) connection
					.prepareStatement(query);
			state.setInt(1, std.getStudentId());
			ResultSet rs = state.executeQuery();
			while (rs.next()) {
				student.setStudentId(rs.getInt("student_id"));
				student.setStudentName(rs.getString("student_name"));
				student.setRegNo(rs.getInt("reg_no"));
				student.setCgpa(rs.getDouble("cgpa"));
			}
		} catch (Exception ex) {
			System.out.println("[GET STUDENT BY ID QUERY EXCEPTION] ["
					+ ex.getMessage() + "]");
		}
		return student;
	}

	@Override
	public boolean deleteStudentById(Student studentId) {
		String query = "delete from student where student_id=?";
		Connection connection = DbConnection.getInstance().getConnection();
		try {
			PreparedStatement state = (PreparedStatement) connection
					.prepareStatement(query);
			state.setInt(1, studentId.getStudentId());
			return state.execute();
		} catch (Exception ex) {
			System.out.println("[STUDENT DELETE BY ID EXCEPTION] ["
					+ ex.getMessage() + "]");
			return false;
		}
	}

}
