package JavaFestival_문제순서;

import java.util.Scanner;

public class ex28번_10진수로 {

	public static void main(String[] args) {

		// 문자열 형태의 2진수를 입력받아 10진수로 바꾸는 프로그램

		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		System.out.print(str + "(2) = ");
		System.out.println(Integer.parseInt(str, 2) + "(10)");

	}

}
