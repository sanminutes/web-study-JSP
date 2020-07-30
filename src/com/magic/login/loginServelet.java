package com.magic.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.magic.dao.EmployeesDAO;
import com.magic.dto.EmployeesVO;

@WebServlet("/login.do")
public class loginServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = "login.jsp";

		HttpSession session = request.getSession();

		if (session.getAttribute("loginUser") != null) {
			url = "main.jsp";
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = "login.jsp";

		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		String level = request.getParameter("level");
		System.out.println(level);

		EmployeesDAO eDao = EmployeesDAO.getInstance();
		int result = eDao.userCheck(id, pass, level);

		if (result == 1) {
			EmployeesVO eVo = eDao.getMember(id);
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", eVo);
			request.setAttribute("message", "�α��� �����߽��ϴ�.");
			url = "main.jsp";
		} else if (result == 0) {
			request.setAttribute("message", "��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		} else if (result == -1) {
			request.setAttribute("message", "���� �Է��� �ùٸ��� ���ֽʽÿ�.");
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
