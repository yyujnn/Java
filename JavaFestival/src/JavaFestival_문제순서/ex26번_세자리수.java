package JavaFestival_문제순서;

import java.util.Scanner;

public class ex26번_세자리수 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 입력>> ");
		int num1 = sc.nextInt();

		System.out.print("두 번째 숫자 입력>> ");
		int num2 = sc.nextInt();

		System.out.println(num1 * (num2 % 10));

		System.out.println(num1 * (num2 % 100 / 10));

		System.out.println(num1 * (num2 / 100));

		System.out.println(num1 * num2);

	}

}
