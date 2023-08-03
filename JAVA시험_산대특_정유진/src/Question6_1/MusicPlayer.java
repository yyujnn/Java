package Question6_1;

import java.util.ArrayList;
import java.util.Scanner;

public class MusicPlayer {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("====뮤직 플레이어====");
			System.out.print("1. 등록 2.목록 3.삭제 4.전체삭제 5.종료 >>");
			int choice = sc.nextInt();
			MusicController cont = new MusicController();
			if (choice == 1) {
				System.out.println("====등록====");

				System.out.print("제목 : ");
				String title = sc.next();
				System.out.print("가수 : ");
				String singer = sc.next();
				System.out.print("시간 : ");
				int playTime = sc.nextInt();

				MusicVO vo = new MusicVO(title, singer, playTime);
				cont.Registration(vo);

			} else if (choice == 2) {
				System.out.println("====노래목록====");
				ArrayList<MusicVO> list = cont.selectList();
				for (MusicVO vo : list) {
					System.out.println((list.indexOf(vo) + 1) + ". " + vo.toString());
				}

			} else if (choice == 3) {
				System.out.println("====노래목록====");
				ArrayList<MusicVO> list = cont.selectList();
				for (MusicVO vo : list) {
					System.out.println((list.indexOf(vo) + 1) + ". " + vo.toString());
				}

				System.out.println("====노래삭제====");
				System.out.print("삭제하고 싶은 노래 번호 입력 : ");
				int index = sc.nextInt();
				String title = list.get(index - 1).getTitle();

				System.out.println(title + " 노래를 삭제합니다.");
				cont.delete(title);

			} else if (choice == 4) {
				System.out.println("====전체노래삭제====");

				MusicVO vo = new MusicVO(null, null, 0);
				cont.deleteAll(vo);

				int row = cont.deleteAll(vo);
				if (row > 0) {
					System.out.println("전체 노래가 삭제되었습니다.");
				} else {
					System.out.println("전체 노래 삭제 실패");
				}

			} else if (choice == 5) {
				System.out.println("MUsicPlayer를 종료합니다.");
				break;

			} else {
				System.out.println("정확한 숫자를 입력해주세요.");
			}

		}
	}

}
