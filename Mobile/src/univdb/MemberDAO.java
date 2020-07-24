package univdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {
	// �����ͺ��̽� ���� ���� ��� ����
	private static final String JDBC_DRIVER = "org.gjt.mm.mysql.Driver";
	private static final String JDBC_URL = "jdbc:mysql://localhost:3306/univdb?useUnicode=true&characterEncoding=euckr";
	private static final String USER = "apple";
	private static final String PASSWD = "1234";

	// �����ͺ��̽� ���� ���� ���� ����
	private Connection con = null;
	private PreparedStatement pstmt = null;

	// JDBC ����̹��� �ε��ϴ� ������
	public MemberDAO() {
		// JDBC ����̹� �ε�
		try {
			Class.forName(JDBC_DRIVER);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

	// �����ͺ��̽� ���� �޼ҵ�
	public void connect() {
		try {
			// �����ͺ��̽��� ����, Connection ��ü ���� 
			con = DriverManager.getConnection(JDBC_URL, USER, PASSWD);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// �����ͺ��̽� ���� ���� �޼ҵ� 
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
	
	
	
		
	// ��� ȸ���� ���� ������ �������� �޼ҵ�
	public ArrayList<MemberEntity> getAllMember() {
	  ArrayList<MemberEntity> list = new ArrayList<MemberEntity>();
	  MemberEntity bean;
	  // Ŀ�ؼ� ����
	  this.connect();
	  // ���� �غ�
	  String sql = "select * from member";
	   
	  try{
	   // ���� ����
	   pstmt = con.prepareStatement(sql);
	   // ���� ���� �� ����� resultset�� �޾���
	   ResultSet rs = pstmt.executeQuery();
	   // �ݺ����� �̿��Ͽ� �����͸� ��Ŭ������ �����Ŀ� �� Bean Ŭ������ ���Ϳ� ����
	   while(rs.next()){
	    bean = new MemberEntity();
	    bean.setId(rs.getString(1)); // ��Ŭ������ ������ �������
	    bean.setPasswd(rs.getString(2));
	    bean.setPasswd1(rs.getString(3));
	    bean.setName(rs.getString(4));
	    bean.setAddress(rs.getString(5));
	    bean.setEmail(rs.getString(6));
	    // ��Ŭ������ ���� �����͸� ���Ϳ� �߰�
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
