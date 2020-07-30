package com.magic.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.magic.dto.EmployeesVO;

public class EmployeesDAO {

	private EmployeesDAO() {

	}

	private static EmployeesDAO instance = new EmployeesDAO();

	public static EmployeesDAO getInstance() {
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

	// 사용자가 인증시 사용하는 메소드

	public int userCheck(String id, String pass, String level) {
		System.out.println(id);
		System.out.println(pass);
		System.out.println(level);
		int result = -1;
		String sql = "select pass, lev from Employess where id=?";
	
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				System.out.println("들어오냔");
				System.out.println(rs.getString("pass"));
				System.out.println(rs.getString("lev"));
				if (rs.getString("pass") != null & rs.getString("pass").contentEquals(pass)
						&& rs.getString("lev") != null & rs.getString("lev").contentEquals(level)) {
					result = 1;
				} else {
					result = 0;
				}
			} else {
				result = -1;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
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

	public EmployeesVO getMember(String id) {
		EmployeesVO eVo = null;
		String sql = "select * from Employess where id=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				eVo = new EmployeesVO();
				eVo.setId(rs.getString("id"));
				eVo.setPass(rs.getString("pass"));
				eVo.setName(rs.getString("name"));
				eVo.setLev(rs.getString("lev"));
				eVo.setEnter(rs.getString("enter"));
				eVo.setGender(rs.getString("gender"));
				eVo.setPhone(rs.getString("phone"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return eVo;
	}

	public int updateMember(EmployeesVO eVo) {
		int result = -1;
		String sql = "update Employess set pass=?, phone=? where id=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, eVo.getPass());
			pstmt.setString(2, eVo.getPhone());
			pstmt.setString(3, eVo.getId());
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

	public int insertMemeber(EmployeesVO eVo) {
		int result = -1;
		String sql = "insert into employess values(?, ?, ?, ?, sysdate, ?, ?)";
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, eVo.getId());
			pstmt.setString(2, eVo.getPass());
			pstmt.setString(3, eVo.getName());
			pstmt.setString(4, eVo.getLev());
			pstmt.setString(5, eVo.getGender());
			pstmt.setString(6, eVo.getPhone());
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
