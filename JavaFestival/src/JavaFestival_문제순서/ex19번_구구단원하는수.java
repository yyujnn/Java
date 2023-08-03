package JavaFestival_문제순서;

import java.util.Scanner;

public class ex19번_구구단원하는수 {

	public static void main(String[] args) {
		// 단수와 곱해지길 원하는 수

		Scanner sc = new Scanner(System.in);
		System.out.println("단수입력 : ");
		int input = sc.nextInt();

		System.out.println("어느 수까지 출력 : ");
		int output = sc.nextInt();
		System.out.println(input + "단");

		for (int i = 1; i <= output; i++) {
			System.out.println(input + "*" + i + "=" + input * i);
		}

	}

}
