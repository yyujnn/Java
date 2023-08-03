package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ex04selectAll {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "service";
			String password = "12345";

			conn = DriverManager.getConnection(url, user, password);

			if (conn != null) {
				System.out.println("연결 성공!");
			} else {
				System.out.println("연결 실패 ..");
			}

			String sql = "SELECT * FROM BIGDATAMEMBER ORDER BY ID";

			psmt = conn.prepareStatement(sql);

			rs = psmt.executeQuery();

			System.out.println("===== 전체 회원 조회 =====");
			System.out.println("ID\t이름\t나이\t점수");

			// rs.next(); --> cursor을 한 행 밑으로 내리는 작업
			// 데이터가 있다면 true, 데이터가 없다면 false
			while (rs.next()) {

				String id = rs.getString("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				int score = rs.getInt("score");

				System.out.println(id + "\t" + name + "\t" + age + "\t" + score);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// DB 연결 종료
			try {
				// ★★ 열어준 순서의 반대로
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

	}

}
