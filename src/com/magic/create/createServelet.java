package com.magic.create;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.magic.dao.EmployeesDAO;
import com.magic.dto.EmployeesVO;

/**
 * Servlet implementation class createServelet
 */
@WebServlet("/create.do")
public class createServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = request.getRequestDispatcher("create_member.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");

		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		String name = request.getParameter("name");
		String lev = request.getParameter("lev");
		String enter = request.getParameter("enter");
		String gender = request.getParameter("gender");
		String phone = request.getParameter("phone");

		EmployeesVO eVo = new EmployeesVO();
		eVo.setId(id);
		eVo.setPass(pass);
		eVo.setName(name);
		eVo.setLev(lev);
		eVo.setEnter(enter);
		eVo.setGender(gender);
		eVo.setPhone(phone);

		EmployeesDAO eDao = EmployeesDAO.getInstance();
		int result = eDao.insertMemeber(eVo);
		if(result==1) {
			request.setAttribute("message", "회원 등록에 성공했습니다." );
		}else {
			request.setAttribute("message", "회원 등록에 실패했습니다.");
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("create_info.jsp");
		dispatcher.forward(request, response);
		
	}

}
