package JavaFestival_3일차;

import java.util.Scanner;

public class ex04수열 {

	public static void main(String[] args) {

		// 정수 n 입력 받아 1, 2, 4, 7, 11 과 같은 수열 n번째 항까지 출력

		Scanner sc = new Scanner(System.in);
		System.out.print("n 입력 : ");
		int input = sc.nextInt();
		int sum = 1;

		for (int i = 0; i < input; i++) {

			sum += i;

			System.out.print(sum + " ");

		}

	}

}
