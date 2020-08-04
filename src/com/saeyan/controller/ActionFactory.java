package com.saeyan.controller;

import com.saeyan.controller.action.BoardCheckPassAction;
import com.saeyan.controller.action.BoardCheckPassFormAction;
import com.saeyan.controller.action.BoardDeleteAction;
import com.saeyan.controller.action.BoardListAction;
import com.saeyan.controller.action.BoardUpdateAction;
import com.saeyan.controller.action.BoardUpdateFormAction;
import com.saeyan.controller.action.BoardViewAction;
import com.saeyan.controller.action.BoardWirteFormAction;
import com.saeyan.controller.action.BoardWriteAction;

public class ActionFactory {
	private static ActionFactory instance = new ActionFactory();

	private ActionFactory() {
		super();
	}

	public static ActionFactory getInstance() {
		return instance;
	}

	public Action getAction(String command) {
		Action action = null;
		System.out.println("ActionFactory :" + command);

		if (command.contentEquals("board_list")) {
			action = new BoardListAction();
		} else if (command.contentEquals("board_write_form")) {
			action = new BoardWirteFormAction();
		} else if (command.equals("board_write")) {
			action = new BoardWriteAction();
		} else if (command.equals("board_view")) {
			action = new BoardViewAction();
		} else if (command.contentEquals("board_check_pass_form")) {
			action = new BoardCheckPassFormAction();
		} else if (command.contentEquals("board_check_pass")) {
			action = new BoardCheckPassAction();
		} else if (command.contentEquals("board_update_form")) {
			action = new BoardUpdateFormAction();
		} else if (command.contentEquals("board_update")) {
			action = new BoardUpdateAction();
		} else if (command.contentEquals("board_delete")) {
			action = new BoardDeleteAction();
		}
		return action;
	}
}
