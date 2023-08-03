package switch문;

import java.util.Scanner;

public class ex01switch문 {

	public static void main(String[] args) {
		
		// switch문 학점계산기
		// 1. 입력 도구 꺼내오기
		Scanner sc = new Scanner (System.in);
		
		// 2. 점수입력 : 출력
		System.out.print("점수 입력: ");
		
		// 3. 숫자 입력 받기
		int totalScore = sc.nextInt();
		
		// 4. 학점 계산하기
		char grade = 'A';
		
		switch (totalScore/10) {
		case 10: 
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		default:
			grade = 'D';
			break;
			
		}
		System.out.println(grade+"학점입니다!");
		
	}
}
