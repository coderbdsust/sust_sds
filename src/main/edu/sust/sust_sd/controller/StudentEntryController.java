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

@WebServlet("/student/entry")
public class StudentEntryController extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("[STUDENT_ENTRY_CONTROLLER - /] [GET] [START]");
		request.getRequestDispatcher("/profile_create.jsp").forward(request,
				response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("[STUDENT_POST_CONTROLLER - /] [POST] [START]");
		Student student = new Student();
		student.setStudentName(request.getParameter("studentName"));
		student.setRegNo(Integer.parseInt(request.getParameter("regNo")));
		student.setCgpa(Double.parseDouble(request.getParameter("cgpa")));
		System.out.println(student);
		IStudentDao dao = new StudentDao();
		dao.save(student);
		response.sendRedirect(request.getContextPath()+"/index");

	}

}
