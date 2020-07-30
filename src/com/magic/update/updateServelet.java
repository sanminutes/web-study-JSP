package com.magic.update;

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

@WebServlet("/update.do")
public class updateServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = request.getRequestDispatcher("mypage.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = "mypage.jsp";
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
		
		HttpSession session = request.getSession();
		session.setAttribute("loginUSer", eVo);
		
		int result = eDao.updateMember(eVo);
		if (result == 1) {
			request.setAttribute("message", "회원 정보가 수정되었습니다.");
			url = "update_info.jsp";

		} else if (result == -1) {
			request.setAttribute("message", "회원 정보 수정이 실패하였습니다.");
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);

	}

}
