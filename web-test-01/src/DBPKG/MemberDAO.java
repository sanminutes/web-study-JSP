package DBPKG;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.saeyan.dto.MemberVO;

public class MemberDAO {
	private MemberDAO() {

	}

	private static MemberDAO instance = new MemberDAO();

	public static MemberDAO getInstance() {
		return instance;
	}

	public Connection getConnection() throws Exception {
		Connection conn = null;
		Context initContext = new InitialContext();
		Context envContext = (Context) initContext.lookup("java:/comp/env");
		DataSource ds = (DataSource) envContext.lookup("jdbc/myoracle");
		conn = ds.getConnection();
		return conn;
	}

	public int insertMember(MemberVO mVo) {
		int result = -1;
		String sql = "insert into member_tbl_02 values(?,?,?,?,?,?,?)";
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, mVo.getCustno());
			pstmt.setString(2, mVo.getCustname());
			pstmt.setString(3, mVo.getPhone());
			pstmt.setString(4, mVo.getAddress());
			pstmt.setString(5, mVo.getJoindate());
			pstmt.setString(6, mVo.getGrade());
			pstmt.setString(7, mVo.getCity());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	public MemberVO searchMember() {
		MemberVO mVo = null;

		String sql = "select * from member_tbl_02";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				mVo = new MemberVO();
				mVo.setCustno(rs.getInt(1));
				mVo.setCustname(rs.getString(2));
				mVo.setPhone(rs.getString(3));
				mVo.setAddress(rs.getString(4));
				mVo.setJoindate(rs.getString(5));
				mVo.setGrade(rs.getString(6));
				mVo.setCity(rs.getString(7));
				System.out.println(rs.getInt(1));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return mVo;
	}

	public int updateMember(MemberVO mVo) {
		int result = -1;
		String sql = "update member_tbl_02 set custname=?, phone=?, address=?, joindate=?, grade=?, city=? where custno=?";
		System.out.println(mVo.getCustno());
		System.out.println(mVo.getCustname());
		System.out.println(mVo.getPhone());
		System.out.println(mVo.getAddress());
		System.out.println(mVo.getJoindate());
		System.out.println(mVo.getGrade());
		System.out.println(mVo.getCity());
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(7, mVo.getCustno());
			pstmt.setString(1, mVo.getCustname());
			pstmt.setString(2, mVo.getPhone());
			pstmt.setString(3, mVo.getAddress());
			pstmt.setString(4, mVo.getJoindate());
			pstmt.setString(5, mVo.getGrade());
			pstmt.setString(6, mVo.getCity());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return result;
	}

}