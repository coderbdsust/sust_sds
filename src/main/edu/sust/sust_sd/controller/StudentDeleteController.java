package edu.sust.sust_sd.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.sust.sust_sd.dao.IStudentDao;
import edu.sust.sust_sd.dao.impl.StudentDao;
import edu.sust.sust_sd.domain.Student;

@WebServlet("/student/del")
public class StudentDeleteController extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("[STUDENT_DELETE_CONTROLLER - /] [GET] [START]");
		String id = request.getParameter("studentId");
		Student student = new Student(Integer.parseInt(id));
		IStudentDao studentDao = new StudentDao();
		studentDao.deleteStudentById(student);
		response.sendRedirect(request.getContextPath()+"/index");

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) {
		System.out.println("[STUDENT_DELETE_CONTROLLER - /] [POST] [START]");

	}

}
