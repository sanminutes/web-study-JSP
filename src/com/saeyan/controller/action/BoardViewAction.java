package com.saeyan.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;

import com.saeyan.controller.Action;
import com.saeyan.dao.BoardDAO;
import com.saeyan.dto.BoardVO;

public class BoardViewAction implements Action {

	@Override
	public void execute(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
			throws javax.servlet.ServletException, IOException {
		// TODO Auto-generated method stub
		String url = "/board/boardView.jsp";

		String num = request.getParameter("num");

		BoardDAO bDao = BoardDAO.getInstance();

		bDao.updateReadCount(num);

		BoardVO bVo = bDao.selectOneBoardByNum(num);

		request.setAttribute("board", bVo);

		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
