package JavaFestival_문제순서;

import java.util.Scanner;

public class ex20번_2진수로 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력>> ");

		int num = sc.nextInt();
		String arr = "";

		while (true) {
			if (num == 1) {
				arr = "1 " + arr;
				break;
			}
			arr = num % 2 + " " + arr;
			num /= 2;

		}
		System.out.println(arr);

	}

}
