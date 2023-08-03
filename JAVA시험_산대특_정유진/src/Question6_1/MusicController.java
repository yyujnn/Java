package Question6_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MusicController {

	private Connection conn = null;
	private PreparedStatement psmt = null;
	private ResultSet rs = null;

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

	// 1. 등록
	public void Registration(MusicVO vo) {
		try {
			getConn();
			String sql = "INSERT INTO MUSCIPLAYER VALUES(?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getTitle());
			psmt.setString(2, vo.getSinger());
			psmt.setInt(3, vo.getPlayTime());

			psmt.executeUpdate(); // --> 실행

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}

	}

	// 2. 목록
	public ArrayList<MusicVO> selectList() {

		MusicVO vo = null;
		ArrayList<MusicVO> list = new ArrayList<MusicVO>();

		try {
			getConn();
			String sql = "SELECT * FROM MUSICPLAYER";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			String title = null;
			String singer = null;
			int playTime = 0;

			while (rs.next()) {
				title = rs.getString("title");
				singer = rs.getString("singer");
				playTime = rs.getInt("playtime");

				vo = new MusicVO(title, singer, playTime);
				list.add(vo);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();

		}

		return list;

	}
	// 3. 삭제

	public void delete(String title) {
		try {
			getConn();
			String sql = "DELETE FROM MUSICPLAYER WHERE TITLE=?";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, title);
			psmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}

	}

	// 4. 전체 삭제
	public int deleteAll(MusicVO vo) {
		int row=0;
		
		try {
			getConn();
			String sql = "DELETE FROM MUSICPLAYER";

			psmt = conn.prepareStatement(sql);
			row=psmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		
		return row;
	}


}
