package 산술연산자;

import java.util.Scanner;

public class ex02산술연산자예제 {

	public static void main(String[] args) {

		// 1. 입력도구 꺼내오기
		Scanner sc = new Scanner (System.in);
		//scan ctrl space(자동완성) -> Scanner-java.util
	
		// 2. 입력 받기
//		String name = sc.next();
//		System.out.println("입력 받은 글자는 >> "+name);
//		
//		 //time.sleep --> 자바버전
//	      try {
//	         Thread.sleep(5000);
//	      } catch (Exception e) {
//	         
//	      }
//	      
//		System.out.print("숫자를 입력하세요.");
//		// 개행을 없애고 싶을 때 ln 삭제
//		
//		// 3. 정수형 숫자 입력 받기
//		int num1 = sc.nextInt();
//		System.out.println();
//		
		// 주석 단축키 : ctrl /
		
		// 1. 정수 입력 글자 출력 + 정수입력
		System.out.print("첫번째 정수입력 : ");
		int num1 = sc.nextInt();
		
		// 2. 정수 입력 글자 출력 + 정수입력
		System.out.print("두번째 정수입력 : ");
		int num2 = sc.nextInt();
		
		// 3. 결과 값 : 출력
		System.out.println("더한 결과 값 : "+ (num1+num2));
		System.out.println("뺀 결과 값 : "+ (num1-num2));
		System.out.println("곱한 결과 값 : "+ num1*num2);
		System.out.println("나눈 결과 값 : "+ (double)num1/num2);
		// 한 줄 복사 단축키 : ctrl alt 화살표
		

				
			
				
	}

}
