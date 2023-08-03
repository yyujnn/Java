package JavaFestival_문제순서;

import java.util.Scanner;

public class ex31번_팩토리얼 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("입력 : ");
		int input = sc.nextInt();
		int fac = 1;

		for (int i = 1; i <= input; i++) {

			fac *= i;

		}
		System.out.println("출력 : " + fac);

	}

}

