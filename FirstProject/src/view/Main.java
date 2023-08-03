package view;

import java.util.Random;
import java.util.Scanner;

import controller.MusicDAO;
import javazoom.jl.player.MP3Player;
import model.MusicDTO;

public class Main {

	public static void main(String[] args) {

		Random rand = new Random();
		String music_list[] = new String[7];

		MP3Player mp3 = new MP3Player();

		// F_R_202,203 랜덤 곡 선정, 재생

		music_list[0] = "C:\\Users\\smhrd\\Desktop\\JavaStudy\\FirstProject\\music\\김종국-별, 바람, 햇살 그리고 사랑.mp3";
		music_list[1] =	"C:\\Users\\smhrd\\Desktop\\JavaStudy\\FirstProject\\music\\배치기.mp3";	
		music_list[2] = "C:\\Users\\smhrd\\Desktop\\JavaStudy\\FirstProject\\music\\aespa-02-Savage.mp3";
		music_list[3] = "C:\\Users\\smhrd\\Desktop\\JavaStudy\\FirstProject\\music\\아이유-03-좋은 날.mp3";
		music_list[4] = "C:\\Users\\smhrd\\Desktop\\JavaStudy\\FirstProject\\music\\잔나비-08-주저하는 연인들을 위해.mp3";
		music_list[5] = "C:\\Users\\smhrd\\Desktop\\JavaStudy\\FirstProject\\music\\삐삐_아이유.mp3";
		music_list[6] = "C:\\Users\\smhrd\\Desktop\\JavaStudy\\FirstProject\\music\\오르트구름-윤하.mp3";

		String playlist = music_list[rand.nextInt(7)];
		mp3.play(playlist);
		System.out.println(playlist);


		int seq=0;
		for(int i = 0;i<music_list.length;i++) {
			if(playlist==music_list[i]) {
				seq=i+1;
			}
			
		}

		
		// F_R_205 노래 확인 -> 글자 수 출력
		MusicDAO dao = new MusicDAO();
		MusicDTO dto = new MusicDTO(seq);

		int Mnum = dao.musicNum(dto);
		
	
		System.out.println("글자 수 : " + Mnum);
		

		// F_R_206 정답 입력
		Scanner sc = new Scanner(System.in);

		System.out.print("정답 입력>> ");
		String answer = sc.next();

		
		
		// F_R_301 정답 여부 확인
		MusicDTO dto1 = new MusicDTO(answer);
		boolean check = dao.answerCheck(dto1);
		
		
		if (check == true) {
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

		
			
		} else {
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

			      for (int i = 0; i < art2.length(); i++) {

			         System.out.print(art2.charAt(i));

			      }

		}
		
		//F_R_309 hint목록
		
		System.out.println("== 힌트를 선택하세요 == ");
		System.out.println("1) 전체 띄어쓰기 공개");
		System.out.println("2) 원하는 한 글자 보여주기");
		System.out.print(">>");
		int hintNum = sc.nextInt();
		
		if(hintNum==1) {
			
			dao.underHint();
			
		
			System.out.println("전체 띄어쓰기 : " + Mnum);
			
			
			
		}else if(hintNum==2) {
			
			
			
			
		}
		
		
		
		
		
		
		

	}

}
