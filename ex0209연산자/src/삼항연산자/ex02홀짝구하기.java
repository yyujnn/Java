package 삼항연산자;

import java.util.Scanner;

public class ex02홀짝구하기 {

	public static void main(String[] args) {

		// 1. 입력도구 꺼내오기
		Scanner sc = new Scanner (System.in);
		
		// 2. 정수를 입력하세요 출력하기 (개행없이)
		System.out.print("정수를 입력하세요 : ");
		
		// 3. 정수 입력받기
		int num1 = sc.nextInt();
		
		// 4. 입력받은 정수가 홀수인지 짝수인지 판별하기
		String result = num1%2==1? "는(은)홀수입니다.":"(은)짝수입니다.";
		
		// 5. 결과 출력하기
		System.out.println(num1+result);
		
	
		System.out.print("정수를 입력하세요 : "); 
		int num2 = sc.nextInt();
		String result2 = num2%2==1? "는(은)홀수입니다.":"(은)짝수입니다.";
		System.out.println(num2+result2);
		
		

		
		
	}

}
