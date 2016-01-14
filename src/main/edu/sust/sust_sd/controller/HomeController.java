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

@WebServlet("/index")
public class HomeController extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("[INDEX_CONTROLLER - /] [GET] [START]");
		IStudentDao studentDao = new StudentDao();
		request.setAttribute("students", studentDao.getStudents());
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) {
		
		System.out.println("[INDEX_CONTROLLER - /] [POST] [START]");

	}

}
