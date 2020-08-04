package com.saeyan.controller.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;

import com.saeyan.controller.Action;

import com.saeyan.dao.BoardDAO;
import com.saeyan.dto.BoardVO;

public class BoardListAction implements Action {

	@Override
	public void execute(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
			throws javax.servlet.ServletException, IOException {
		// TODO Auto-generated method stub
		String url = "/board/boardList.jsp";
 
		BoardDAO bDao = BoardDAO.getInstance();

		List<BoardVO> boardList = bDao.selectAllBoards();

		request.setAttribute("boardList", boardList);

		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
