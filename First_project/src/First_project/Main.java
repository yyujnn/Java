package First_project;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import First_project.MainDAO;
import First_project.MainDTO;
import First_project.MainDAO;
import First_project.MainDTO;
import javazoom.jl.player.MP3Player;

public class Main {

	public static void main(String[] args) {

//========================================= [1] INTRO 부분 ==========================================

		Scanner sc = new Scanner(System.in);

		// Opening MP3
		MP3Player mp3 = new MP3Player();
		mp3.play("C:\\Users\\smhrd\\Desktop\\JavaStudy\\First_project\\music\\Opening.mp3");

		// Title
		String art = """
				======================================================================

				      █████╗ ███╗   ███╗ █████╗ ███████╗██╗███╗   ██╗ ██████╗
				     ██╔══██╗████╗ ████║██╔══██╗╚══███╔╝██║████╗  ██║██╔════╝
				     ███████║██╔████╔██║███████║  ███╔╝ ██║██╔██╗ ██║██║  ███╗
				     ██╔══██║██║╚██╔╝██║██╔══██║ ███╔╝  ██║██║╚██╗██║██║   ██║
				     ██║  ██║██║ ╚═╝ ██║██║  ██║███████╗██║██║ ╚████║╚██████╔╝
				     ╚═╝  ╚═╝╚═╝     ╚═╝╚═╝  ╚═╝╚══════╝╚═╝╚═╝  ╚═══╝ ╚═════╝

				  ███████╗ █████╗ ████████╗██╗   ██╗██████╗ ██████╗  █████╗ ██╗   ██╗
				  ██╔════╝██╔══██╗╚══██╔══╝██║   ██║██╔══██╗██╔══██╗██╔══██╗╚██╗ ██╔╝
				  ███████╗███████║   ██║   ██║   ██║██████╔╝██║  ██║███████║ ╚████╔╝
				  ╚════██║██╔══██║   ██║   ██║   ██║██╔══██╗██║  ██║██╔══██║  ╚██╔╝
				  ███████║██║  ██║   ██║   ╚██████╔╝██║  ██║██████╔╝██║  ██║   ██║
				  ╚══════╝╚═╝  ╚═╝   ╚═╝    ╚═════╝ ╚═╝  ╚═╝╚═════╝ ╚═╝  ╚═╝   ╚═╝

				======================================================================
				                        """;

		for (int i = 0; i < art.length(); i++) {

			System.out.print(art.charAt(i));
		}
		System.out.println(); // 개행

		System.out.println("============ AMZING SATURDAY(놀라운 토요일)게임에 오신걸 환영합니다 =============");
		while (true) {
			System.out.println("1.회원가입 2. 로그인 3. 랭킹 4. 종료");
			int choice = sc.nextInt();
			if (choice == 1) {

				System.out.println("======회원가입======");
				System.out.print("Id : ");
				String id = sc.next();
				System.out.print("PW : ");
				String pw = sc.next();

				MainDAO dao = new MainDAO();
				MainDTO dto = new MainDTO(id, pw);

				int row = dao.Join(dto);
				if (row > 0) {
					System.out.println("회원가입 성공");
				} else {
					System.out.println("입력 정보를 다시 확인해 주세요.");
				}

			} else if (choice == 2) {
				System.out.println("======로 그 인======");
				System.out.print("Id : ");
				String id = sc.next();
				System.out.print("PW : ");
				String pw = sc.next();
				MainDAO dao = new MainDAO();
				MainDTO dto = new MainDTO(id, pw);

				String uName = dao.login(dto);
				if (uName != null) {// 게임 바로 시작하게 해야함.
					mp3.stop();
					game(id);
				} else {
					System.out.println("아이디 또는 비밀번호를 다시 확인해주세요");
				}
			} else if (choice == 3) {
				MainDAO dao = new MainDAO();
				System.out.println("등수" + "\t" + "아이디" + "\t" + "점수");
				ArrayList<MainDTO> list = dao.rank();
				for (MainDTO dto : list) {

					System.out.print(dto.getRownum() + "\t");
					System.out.print(dto.getId() + "\t");
					System.out.print(dto.getScore() + "\t");
					System.out.println();

				}
			} else if (choice == 4) {
				System.out.println("게임을 종료합니다.");
				System.exit(0);
				break;
			}

		}
	}

//========================================= [2] GAME 부분==========================================

	public static void game(String id) {
		int score = 0;

		// 사용한 노래 seq저장 배열
		int[] save = new int[3];

		Random rand = new Random();

		// save[j] 미리 정해주기 0~2
		save[0] = rand.nextInt(7) + 1;

		for (int j = 1; j < 3; j++) {
			save[j] = rand.nextInt(7) + 1;
			for (int i = 0; i < j; i++) {
				if (save[j] == save[i]) {
					j--;
					break;
				}
			}
		}

		for (int hp = 0; hp < 3; hp++) {

			int seq = save[hp];
			String music_list[] = new String[7];

			music_list[0] = "C:\\Users\\smhrd\\Desktop\\JavaStudy\\First_project\\music\\김종국 별, 바람, 햇살 그리고 사랑.mp3";
			music_list[1] = "C:\\Users\\smhrd\\Desktop\\JavaStudy\\First_project\\music\\배치기 마이동풍.mp3";
			music_list[2] = "C:\\Users\\smhrd\\Desktop\\JavaStudy\\First_project\\music\\aespa Savage.mp3";
			music_list[3] = "C:\\Users\\smhrd\\Desktop\\JavaStudy\\First_project\\music\\아이유 좋은 날.mp3";
			music_list[4] = "C:\\Users\\smhrd\\Desktop\\JavaStudy\\First_project\\music\\잔나비 주저하는 연인들을 위해.mp3";
			music_list[5] = "C:\\Users\\smhrd\\Desktop\\JavaStudy\\First_project\\music\\아이유 삐삐.mp3";
			music_list[6] = "C:\\Users\\smhrd\\Desktop\\JavaStudy\\First_project\\music\\윤하 오르트구름.mp3";

			String playlist = null;

			for (int i = 0; i < music_list.length; i++) {
				if (seq == i) {
					playlist = music_list[seq - 1];
				}
			}

			// F_R_204 노래 제목, 노래 설명 출력
			MainDAO dao = new MainDAO();
			GameDTO dto = new GameDTO(seq);

			GameDTO dto2 = dao.musicInfo(dto);
			System.out.println("제목 : " + dto2.getTitle());
			System.out.println("곡설명: " + dto2.getInfo());

			MP3Player mp3 = new MP3Player();
			mp3.play(playlist);

			// F_R_205 노래 확인 -> 글자 수 출력

			int Mnum = dao.musicNum(dto);

			System.out.println("글자 수 : " + Mnum);
			int count = 0;
			boolean check = true;
			String answer = null;

			while (true) {
				count++;

				// F_R_206 정답 입력
				Scanner sc = new Scanner(System.in);
				String select = sc.next();

				switch (select) {
				case "정답":
					mp3.stop();
					break;
				}

				System.out.print("정답 입력>> ");
				answer = sc.next();

				// F_R_301 정답 여부 확인
				GameDTO dto1 = new GameDTO(answer, seq);
				check = dao.answerCheck(dto1);

				if (check != true) {

					mp3.play("C:\\Users\\smhrd\\Desktop\\JavaStudy\\First_project\\music\\오답.mp3");

					System.out.println("오답입니다!");
					String art2 = """

							Y88b   d88P
							 Y88b d88P
							  Y88o88P
							   Y888P
							   d888b
							  d88888b
							 d88P Y88b
							d88P   Y88b

							      """;

					for (int j = 0; j < art2.length(); j++) {

						System.out.print(art2.charAt(j));

					}

					if (count > 2) {

						break;
					}

					System.out.println("힌트  ==> [1] 자동띄어쓰기 [2] 한글자");
					int hint = sc.nextInt();

					String str = dao.hintCheck(dto);
					String under = dao.hintUnder(dto);

					switch (hint) {

					case 1:
						System.out.println(under);

						break;
					case 2:

						System.out.print("원하는 자리 번호를 입력하세요 >> ");
						int num = sc.nextInt();
						String[] arr = new String[str.length()];
						arr = str.split("");
						System.out.println(arr[num - 1]);

						break;

					}
					System.out.println("5초후 노래가 다시 재생됩니다");
					try {
						Thread.sleep(5000);
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}

					mp3.play(playlist);

				} else {

					mp3.play("C:\\Users\\smhrd\\Desktop\\JavaStudy\\First_project\\music\\정답.mp3");

					System.out.println("정답입니다~");
					String art1 = """

							  `oooooo'
							 d8P'  `Y8b
							888      888
							888      888
							888      888
							`88b    d88'
							 `Y8bood8P'

							                        """;

					for (int i = 0; i < art1.length(); i++) {

						System.out.print(art1.charAt(i));

					}

					System.out.println("정답!");
					String answer1 = dao.answer(dto);
					System.out.println("정답 : " + answer1);
					break;

				}
			}

			if (count > 2) {

				System.out.println("남음 기회가 없습니다, 정답공개");

				String answer1 = dao.answer(dto);
				System.out.println("정답 :" + answer1);

			}
			switch (count) {
			case 1:
				score += 100;
				break;
				
			case 2:
				score += 50;
				break;
			case 3:
				score += 20;
				break;

			}

		}
		MainDAO dao = new MainDAO();
		System.out.println("게임이 끝났습니다.");
		System.out.println("점수 : " + score);
		MainDTO dto5 = new MainDTO(id, score);
		int row = dao.score(dto5);

		if (row > 0) {
			System.out.println("점수저장성공");
		} else {
			System.out.println("점수저장 실패");
		}


	}
}