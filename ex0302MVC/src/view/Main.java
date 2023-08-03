package view;

import java.lang.reflect.Member;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import controller.MemberDAO;
import model.MemberDTO;

public class Main {
	// View 담당

	public static void main(String[] args) {
		// 디자인 패턴 : 계속 같은 문제가 발생하여, 이 문제를 해결하고자
		// 형식, 규칙을 지정해 놓은 것
		// MVC 패턴
		// Model : 데이터를 저장하거나, 조작하기 위한 코드들의 모음
		// View : 사용자에게 직접 보여지는 부분
		// Controller : 실제 기능이 일어나는 부분

		Scanner sc = new Scanner(System.in);
		System.out.println("==== SMHRD 회원관리 프로그램 ====");
		// [1]회원가입 [2]로그인 [3]회원탈퇴 [4]전체회원조회 [5]회원정보수정
		// 1,2,3,4,5를 제외한 숫자를 입력하면 종료

		while (true) {
			System.out.print("[1]회원가입 [2]로그인 [3]회원탈퇴 [4]전체회원조회 [5]회원정보수정 >> ");
			int choice = sc.nextInt();

			if (choice == 1) {
				System.out.println("==== 회원가입 ====");

				System.out.print("ID 입력 : ");
				String id = sc.next();
				System.out.print("PW 입력 : ");
				String pw = sc.next();
				System.out.print("이름 입력 : ");
				String name = sc.next();
				System.out.print("나이 입력 : ");
				int age = sc.nextInt();
				System.out.print("점수 입력 : ");
				int score = sc.nextInt();

				// 데이터베이스에 접근해서 데이터 추가하기!
				// --> 앞으로 데이터베이스 접근과 관련된 모든 역할은 DAO 담당 !
				// 1) DAO 꺼내오기
				MemberDAO dao = new MemberDAO();
				// 2) dao에게 보내줄 데이터 하나로 묶어주기
				MemberDTO dto = new MemberDTO(id, pw, name, age, score);
				// 3) 회원가입 기능 사용하기
				int row = dao.join(dto);

				if (row > 0) {
					System.out.println("회원가입 성공~!");
				} else {
					System.out.println("회원가입 실패ㅠㅠ");
				}

			} else if (choice == 2) {
				System.out.println("==== 로그인 ====");

				// 1. 사용자로부터 id와 password 입력받기
				System.out.print("ID 입력 : ");
				String id = sc.next();
				System.out.print("Pw 입력 : ");
				String pw = sc.next();

				// 2. DAO 꺼내오기
				MemberDAO dao = new MemberDAO();

				// 3. dao가 가지고있는 로그인 기능 사용하기
				MemberDTO dto = new MemberDTO(id, pw);
				String uName = dao.login(dto);
				// 로그인 성공실패여부 판단 출력
				if (uName != null) {
					System.out.println(uName + "님 환영합니다~");

				} else {
					System.out.println("로그인이 실패했습니다.");
					System.out.println("아이디나 비밀번호를 다시 확인해보세요.");
				}

			} else if (choice == 3) {
				System.out.println("==== 회원탈퇴 ====");

				// 1. 사용자로부터 id와 password 입력받기
				System.out.print("ID 입력 : ");
				String id = sc.next();
				System.out.print("PW 입력 : ");
				String pw = sc.next();

				// 2. DAO 꺼내오기
				MemberDAO dao = new MemberDAO();
				// 3. 보내줄 데이터 하나로 묶어주기
				MemberDTO dto = new MemberDTO(id, pw);
				// 3. dao가 가지고있는 회원탈퇴 기능 사용하기
				int row = dao.delete(dto);
				if (row > 0) {
					System.out.println("회원 탈퇴 성공~!");
				} else {
					System.out.println("회원 탈퇴 실패ㅠㅠ");
				}

//				System.out.println("==== 전체회원조회 ====");
//
//				ArrayList<MemberDTO> list = dao.selectAll();
//				for (MemberDTO dto1 : list) {
//					System.out.println((list.indexOf(dto1)+1)+". "+dto1.toString());
//
//				}
//				System.out.println("탈퇴할 아이디 고르삼");
//				int index = sc.nextInt();
//				String id=list.get(index-1).getId();
//				
//				
//				System.out.println(id +"아이디를 삭제합니다");
//
//				dao.delete1(id);

			} else if (choice == 6) {

				// 전체 삭제 test
				MemberDAO dao = new MemberDAO();
				MemberDTO dto = new MemberDTO(null, null, null, choice, choice);
				int row = dao.deleteAll(dto);
				if (row > 0) {
					System.out.println("전체 회원 탈퇴 성공~!");
				} else {
					System.out.println("전체 회원 탈퇴 실패ㅠㅠ");
				}

			} else if (choice == 4) {

				System.out.println("==== 전체회원조회 ====");
				// System.out.println("ID\t이름\t나이\t점수");

				MemberDAO dao = new MemberDAO();
				ArrayList<MemberDTO> list = dao.selectAll();

				for (MemberDTO dto : list) {
					// System.out.print(dto.getId() + "\t" + dto.getName() + "\t" + dto.getAge() +
					// "\t" + dto.getScore());
					// System.out.println();
					System.out.println((list.indexOf(dto) + 1) + ". " + dto.toString());

				}

			} else if (choice == 5) {
				System.out.println("==== 회원정보수정 ====");

				System.out.print("ID 입력 : ");
				String id = sc.next();
				System.out.print("PW 입력 : ");
				String pw = sc.next();
				System.out.print("수정할 점수 입력 : ");
				int newScore = sc.nextInt();

				MemberDAO dao = new MemberDAO();

				MemberDTO dto = new MemberDTO(id, pw, newScore);

				int row = dao.update(dto);

				if (row > 0) {
					System.out.println("회원 점수 수정 성공~!");
				} else {
					System.out.println("회원 점수 수정 실패ㅠㅠ");
				}

			} else {
				System.out.println("종료합니다.");
				break;

			}
		}

	}

}
