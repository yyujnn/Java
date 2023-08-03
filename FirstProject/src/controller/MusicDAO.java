package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.MusicDTO;

public class MusicDAO {

	private Connection conn = null;
	private PreparedStatement psmt = null;
	private ResultSet rs = null;

	private void getConn() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
			String user = "cgi_2_0306_1";
			String password = "smhrd1";
			conn = DriverManager.getConnection(url, user, password);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

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

	// F_R_205 글자 수 공개
	public int musicNum(MusicDTO dto) {
		int Mnum = 0;
		try {
			getConn();
			String sql = "SELECT * FROM MUSIC WHERE MUSIC_SEQ=?";

			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, dto.getSeq());

			rs = psmt.executeQuery();
			if (rs.next() == true) {
				Mnum = rs.getInt("MUSIC_NUM");
			}
		} catch (Exception e) {
		} finally {
			getClose();
		}

		return Mnum;
	}

	// F_R_301 정답 여부 확인
	public boolean answerCheck(MusicDTO dto1) {

		boolean check = false;

		try {
			getConn();
			String sql = "SELECT * FROM MUSIC WHERE MUSIC_ANSWER=?";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto1.getAnswer());
			//psmt.setInt(1, dto1.getSeq());
			rs = psmt.executeQuery();

			
			if(rs.next()==true) {
				check=true;
			}

		} catch (Exception e) {
		} finally {
			getClose();
		}

		return check;
	}

	public String underHint() {

		String under = null;
		
		
		return under;
		
	}

}
