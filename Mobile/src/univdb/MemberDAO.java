package univdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {
	// 데이터베이스 연결 관련 상수 선언
	private static final String JDBC_DRIVER = "org.gjt.mm.mysql.Driver";
	private static final String JDBC_URL = "jdbc:mysql://localhost:3306/univdb?useUnicode=true&characterEncoding=euckr";
	private static final String USER = "apple";
	private static final String PASSWD = "1234";

	// 데이터베이스 연결 관련 변수 선언
	private Connection con = null;
	private PreparedStatement pstmt = null;

	// JDBC 드라이버를 로드하는 생성자
	public MemberDAO() {
		// JDBC 드라이버 로드
		try {
			Class.forName(JDBC_DRIVER);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

	// 데이터베이스 연결 메소드
	public void connect() {
		try {
			// 데이터베이스에 연결, Connection 객체 저장 
			con = DriverManager.getConnection(JDBC_URL, USER, PASSWD);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 데이터베이스 연결 해제 메소드 
	public void disconnect() {

		try{
			if(pstmt != null)	
				pstmt.close();	
		 
			if(con != null)
				con.close();
		
		} catch(SQLException e){
			e.printStackTrace();
		}
	}
	


	public boolean insertDB(MemberEntity member) {
		boolean success = false; 
		connect();
		String sql ="insert into member values(?, ?, ?, ?, ?, ?)";		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPasswd());
			pstmt.setString(3, member.getPasswd1());
			pstmt.setString(4, member.getName());
			pstmt.setString(5, member.getAddress());
			pstmt.setString(6, member.getEmail());
			int rows = pstmt.executeUpdate();
			if(rows == 1) success = true; 
		} catch (SQLException e) {
			e.printStackTrace();
			return success;
		}
		finally {
			disconnect();
		}
		return success;
	}
	

	
	
	public boolean isPasswd(String id, String passwd) {
		boolean success = false;
		connect();		
		String sql ="select passwd from member where id=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			String orgPasswd = rs.getString(1);
			if ( passwd.equals(orgPasswd) ) success = true; 
			rs.close();			
		} catch (SQLException e) {
			e.printStackTrace();
			return success;
		}
		finally {
			disconnect();
		}
		return success;
	}	
	

	
	public MemberEntity getMember(String id) {	
		connect();
		String SQL = "select * from member where id = ?";
		MemberEntity member = new MemberEntity();
		
		try {
			pstmt = con.prepareStatement(SQL);
			pstmt.setString(1, id);
			ResultSet rs = pstmt.executeQuery();			
			rs.next();
			member.setId( rs.getString("id") );
			member.setPasswd ( rs.getString("passwd") );
			member.setName ( rs.getString("name") );
			rs.close();			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		finally {
			disconnect();
		}
		return member;
	}	
	
	
	
		
	// 모든 회원에 대한 정보를 가져오는 메소드
	public ArrayList<MemberEntity> getAllMember() {
	  ArrayList<MemberEntity> list = new ArrayList<MemberEntity>();
	  MemberEntity bean;
	  // 커넥션 연결
	  this.connect();
	  // 쿼리 준비
	  String sql = "select * from member";
	   
	  try{
	   // 쿼리 실행
	   pstmt = con.prepareStatement(sql);
	   // 쿼리 실행 후 결과를 resultset이 받아줌
	   ResultSet rs = pstmt.executeQuery();
	   // 반복문을 이용하여 데이터를 빈클래스에 담은후에 그 Bean 클래스를 벡터에 저장
	   while(rs.next()){
	    bean = new MemberEntity();
	    bean.setId(rs.getString(1)); // 빈클래스에 정보를 집어넣음
	    bean.setPasswd(rs.getString(2));
	    bean.setPasswd1(rs.getString(3));
	    bean.setName(rs.getString(4));
	    bean.setAddress(rs.getString(5));
	    bean.setEmail(rs.getString(6));
	    // 빈클래스에 담은 데이터를 백터에 추가
	    list.add(bean);
	   }
	   con.close();
	   pstmt.close();
	   rs.close();
	    
	  } catch(Exception e){
	   e.printStackTrace();
	  }
	  return list;
	 }
	public int idCheck(String id){
		  int re = 0;
		  connect();
		  ResultSet rs = null;
		  try{
		   String sql = "select * from member where id=?";
		   pstmt = con.prepareStatement(sql);
		   pstmt.setString(1, id);
		   rs = pstmt.executeQuery();
		   if(rs.next()){
		    re = 1;
		   }
		  }catch(Exception e){
		   e.printStackTrace();
		  }finally{
		  disconnect();
		  }
		  return re;
	}


}
