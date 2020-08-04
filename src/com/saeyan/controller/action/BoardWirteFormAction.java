package com.saeyan.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;

import com.saeyan.controller.Action;

public class BoardWirteFormAction implements Action {

	@Override
	public void execute(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
			throws javax.servlet.ServletException, IOException {
		// TODO Auto-generated method stub
		String url = "/board/boardWrite.jsp";

		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
