package while문;

import java.util.Scanner;

public class ex04while문예제 {
	

	public static void main(String[] args) {

		
		
		Scanner sc = new Scanner(System.in);

		int even = 0;
		int odd = 0;

		while (true) {

			System.out.print("숫자 입력 : ");
			int input = sc.nextInt();

			if (input % 2 == 0) {
				even++;
			} else if (input % 2 == 1) {
				odd++;
			}

			if (input == -1) {
				System.out.println("종료되었습니다.");
				break;
			}

			System.out.println("짝수 개수 : " + even);
			System.out.println("홀수 개수 : " + odd);

		}

	}

}




