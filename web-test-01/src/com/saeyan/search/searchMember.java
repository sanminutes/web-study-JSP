package com.saeyan.search;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saeyan.dto.MemberVO;

import DBPKG.MemberDAO;

/**
 * Servlet implementation class searchMember
 */
@WebServlet("/listSearch.do")
public class searchMember extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = request.getRequestDispatcher("listSearch.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		MemberDAO mDao = MemberDAO.getInstance();
		MemberVO mVo = mDao.searchMember();
		mVo.getCustno();
		RequestDispatcher dispatcher = request.getRequestDispatcher("listSearch.jsp");
		dispatcher.forward(request, response);
	}

}
