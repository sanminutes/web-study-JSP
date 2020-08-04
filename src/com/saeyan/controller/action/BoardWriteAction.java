package com.saeyan.controller.action;

import java.io.IOException;

import com.saeyan.controller.Action;
import com.saeyan.dao.BoardDAO;
import com.saeyan.dto.BoardVO;

public class BoardWriteAction implements Action {

	@Override
	public void execute(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)
			throws javax.servlet.ServletException, IOException {
		// TODO Auto-generated method stub
		BoardVO bVo = new BoardVO();

		bVo.setName(request.getParameter("name"));
		bVo.setPass(request.getParameter("pass"));
		bVo.setEmail(request.getParameter("email"));
		bVo.setTitle(request.getParameter("title"));
		bVo.setContent(request.getParameter("content"));

		BoardDAO bDao = BoardDAO.getInstance();
		bDao.insertBoard(bVo);

		new BoardListAction().execute(request, response);
	}

}
