package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ddd
 */
@WebServlet("/JoinServlet")
public class JoinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=UTF-8");

		String name = request.getParameter("name");
		String num_id = request.getParameter("IDnum") + " - " + request.getParameter("IDnum_2");
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String email;
		if (request.getParameter("email_b").isEmpty()) {
			email = request.getParameter("email_a") + "@" + request.getParameter("email");
		} else {
			email = request.getParameter("email_a") + "@" + request.getParameter("email_b");
		}

		String post = request.getParameter("post");
		String addr = request.getParameter("addr") + " " + request.getParameter("addr_b");
		String contact = request.getParameter("contact");
		String job = request.getParameter("interest");
		String[] item = request.getParameterValues("item");

		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.println("이름 :<b>");
		out.println(name);
		out.println("<br></b>주민번호 :<b>");
		out.println(num_id);
		out.println("<br></b>아이디:<b>");
		out.println(id);
		out.println("<br></b>비밀번호 :<b>");
		out.println(pwd);
		out.println("<br></b>이메일:<b>");
		out.println(email);
		out.println("<br></b>우편번호 :<b>");
		out.println(post);
		out.println("<br></b>주소 :<b>");
		out.println(addr);
		out.println("<br></b>핸드폰번호 :<b>");
		out.println(contact);
		out.println("<br></b>직업 :<b>");
		out.println(job);
		out.println("<br></b>관심분야 :<b>");
		if (item == null) {
			out.print("선택한 항목이 없습니다.");
		} else {
			for (String items : item) {
				out.print(items + " ");
			}
		}
		out.println("</b></pre><p><a href='javascript:history.go(-1)'>다시</a>");
		out.print("</body></html>");
		out.close();
	}

}
