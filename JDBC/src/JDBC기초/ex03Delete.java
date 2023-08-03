package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ex03Delete {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. 사용자한테 id, pw 입력받기
		System.out.println("--회원 탈퇴--");
		System.out.print("ID 입력 : ");
		String id = sc.next();
		System.out.print("PW 입력 : ");
		String pw = sc.next();

		Connection conn = null;
		PreparedStatement psmt = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "service";
			String password = "12345";

			conn = DriverManager.getConnection(url, user, password);

			if (conn != null) {
				System.out.println("연결 성공!");
			} else {
				System.out.println("연결 실패 .. ");
			}

			String sql = "DELETE FROM BIGDATAMEMBER WHERE ID=? AND PW=?";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);

			int row = psmt.executeUpdate();

			if (row > 0) {
				System.out.println("회원 탈퇴 성공~!");
			} else {
				System.out.println("회원 탈퇴 실패ㅠㅠ");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// ★★★ 자원을 반납할 때는 항상 사용한 순서의 역순으로 반납한다.
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
