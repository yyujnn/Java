package 단순if문;

import java.util.Scanner;

public class ex02단순if문예제 {

	public static void main(String[] args) {
		
		// 1. 입력 도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		
		// 2. 정수를 입력하세요. 출력하기(개행없이)
		System.out.print("정수를 입력하세요: ");
		
		// 3. 숫자 입력받기
		int num=sc.nextInt();
		
		// 4. 입력받은 숫자가 3의 배수이면서 5의 배수인지 비교하기
		if(num%3==0 && num%5==0) {
			
			// 5. 참이라면 3과 5의 배수입니다 출력하기
			System.out.println("3과 5의 배수입니다.");
		

		}
		
		// 다른 풀이
		if(num%3==0) {
			// 3의 배수이다
			if(num%5==0) {
				// 3의 배수이면서 5의 배수이다.
				System.out.println("3과 5의 배수입니다");
			}			
		}
		
		

		
		
		
	}

}
