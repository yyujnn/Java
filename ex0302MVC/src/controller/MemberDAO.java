package controller;

import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.MemberDTO;

public class MemberDAO {
	// Controller 역할 담당

	// Data Access Object : 데이터에 접근하는 것을 도와주는 객체
	// DB 연결해서 insert, delete, update, select 하는 코드들의 모음
	// 메소드 형태로 코드 작성
	// 필드
	private Connection conn = null;
	private PreparedStatement psmt = null;
	private ResultSet rs = null;

	// 공통으로 사용할 메소드
	// 데이터베이스 연결하는 메소드
	private void getConn() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "service";
			String password = "12345";
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 데이터베이스 연결 끊는 메소드
	private void getClose() {
		try {
			if (rs != null)
				rs.close();
			if (psmt != null)
				psmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 회원가입 메소드
	public int join(MemberDTO dto) {
		int row = 0;

		try {
			getConn();
			String sql = "INSERT INTO BIGDATAMEMBER VALUES(?,?,?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());
			psmt.setString(3, dto.getName());
			psmt.setInt(4, dto.getAge());
			psmt.setInt(5, dto.getScore());

			row = psmt.executeUpdate(); // --> 실행

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return row;

	}

	// 로그인 기능
	public String login(MemberDTO dto) {

		String uName = null;

		try {
			getConn();
			String sql = "SELECT * FROM BIGDATAMEMBER WHERE ID=? AND PW=?";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());

			rs = psmt.executeQuery(); // -> SELECT 할 때
			if (rs.next() == true) {
				uName = rs.getString("name");

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return uName; // rs는 자원이라 리턴x

	}

	// 회원 탈퇴 기능
	public int delete(MemberDTO dto) {
		int row = 0;

		try {
			getConn();
			String sql = "DELETE FROM BIGDATAMEMBER WHERE ID=? AND PW=?";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());

			row = psmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return row;

	}

	// test용
	public void delete1(String id) {

		try {
			getConn();
			String sql = "DELETE FROM BIGDATAMEMBER WHERE ID=?";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);

			psmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}

	}

	// 전체 삭제 test 용
	public int deleteAll(MemberDTO dto) {
		int row = 0;

		try {
			getConn();
			String sql = "DELETE FROM BIGDATAMEMBER";

			psmt = conn.prepareStatement(sql);
			row = psmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}

		return row;
	}

	// 정보 수정 기능
	public int update(MemberDTO dto) {
		int row = 0;

		try {
			getConn();

			String sql = "UPDATE BIGDATAMEMBER SET SCORE=? WHERE ID=? AND PW=?";

			psmt = conn.prepareStatement(sql);

			psmt.setInt(1, dto.getScore());
			psmt.setString(2, dto.getId());
			psmt.setString(3, dto.getPw());

			row = psmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}

		return row;
	}

	// 전체 회원 조회 메소드
	public ArrayList<MemberDTO> selectAll() {

		MemberDTO dto = null;
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();

		try {
			getConn();
			String sql = "SELECT * FROM BIGDATAMEMBER ORDER BY ID";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			String id = null;
			String name = null;
			int age = 0;
			int score = 0;

			while (rs.next()) {
				id = rs.getString("id");
				name = rs.getString("name");
				age = rs.getInt("age");
				score = rs.getInt("score");
				dto = new MemberDTO(id, "", name, age, score);
				list.add(dto);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();

		}
		return list; // 클래스라 리턴가능 (자료형)

	}

}
