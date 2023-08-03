package while문;

import java.util.Scanner;

public class ex03while문예제 {

	public static void main(String[] args) {

		// 1. 입력 도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		// 바뀌는 변수 밖에 정의

		while (true) {

			// 2. 정수 입력 출력하기 (개행없이)
			// 3. 정수 입력 받기
			System.out.print("정수 입력 : ");
			int input = sc.nextInt();

			// 4. 입력 받은 정수를 누적하기
			// sum = sum + input ;
			sum += input;

			System.out.println("누적결과 : " + sum);

			// -1을 입력하면 종료되었습니다. 출력 후 프로그램 종료
			if (input == -1) {
				System.out.println("종료되었습니다.");
				break;
			}
		}

	}

}
