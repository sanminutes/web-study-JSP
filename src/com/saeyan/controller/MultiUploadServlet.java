package com.saeyan.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

/**
 * Servlet implementation class MultiUploadServlet
 */
@WebServlet("/upload2.do")
public class MultiUploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");

		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		String savePath = "upload";

		int uploadFileSizeLimit = 5 * 1024 * 1024;
		int cnt = 0;
		String encType = "UTF-8";

		ServletContext context = getServletContext();
		String uploadFilePath = context.getRealPath(savePath);

		try {
			MultipartRequest multi = new MultipartRequest(request, uploadFilePath, uploadFileSizeLimit, encType,
					new DefaultFileRenamePolicy());
			Enumeration files = multi.getFileNames();

			while (files.hasMoreElements()) {
				cnt++;
				String file = (String) files.nextElement();
				String file_name = multi.getFilesystemName(file);
				String ori_file_name = multi.getOriginalFileName(file);
				out.print("<br>" + cnt + ".���ε�� ���ϸ� : " + file_name);
				out.print("<br> ���� ���ϸ� : " + ori_file_name);
				out.print("<hr>");
			}

		} catch (Exception e) {
			System.out.print("���� �߻� : " + e);
		}
	}

}
