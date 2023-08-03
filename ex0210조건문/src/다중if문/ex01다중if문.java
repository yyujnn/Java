package 다중if문;

import java.util.Scanner;

public class ex01다중if문 {

	public static void main(String[] args) {
		
		// 사용자로부터 숫자 입력 받아서 0인지, 홀수인지, 짝수인지 판단하는 프로그램
		// 1. 입력 도구 꺼내오기
		
		Scanner sc = new Scanner (System.in);
		// 2. 숫자를 입력하세요 출력하기
		System.out.print("숫자를 입력하세요 >> ");
		
		// 3. 숫자 입력받기.
		int num = sc.nextInt();
		
		// 4. 조건을 판단해서 0인지, 홀수인지, 짝수인지 출력
		// ** 조건식 순서도 생각하자 **
		
		if(num==0) {
			System.out.println("0입니다");
		}
		else if (num%2==1) {
			System.out.print("홀수입니다.");
		}
		else {
			System.out.print("짝수입니다.");
		}
		
	}
	
	
	
	
	
}
	

