

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DBPKG.MemberDAO;
import com.saeyan.dto.MemberVO;


@WebServlet("/join.do")
public class JoinServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("join.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		int custno = Integer.parseInt(request.getParameter("custno"));
		String custname = request.getParameter("custname");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");
		String joindate = request.getParameter("joindate");
		String grade = request.getParameter("grade");
		String city = request.getParameter("city");

		MemberVO mVo = new MemberVO();
		mVo.setCustno(custno);
		mVo.setCustname(custname);
		mVo.setPhone(phone);
		mVo.setAddress(address);
		mVo.setJoindate(joindate);
		mVo.setGrade(grade);
		mVo.setCity(city);

		MemberDAO mDao = MemberDAO.getInstance();
		int result = mDao.insertMember(mVo);

		if (result == 1) {
			request.setAttribute("message", "회원등록이 완료 되었습니다!");
			
		} else {
			request.setAttribute("message", "회원등록이 실패하였습니다.");
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher("join.jsp");
		dispatcher.forward(request, response);
	}

}
