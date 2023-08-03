package 메소드;

import java.util.Scanner;

public class ex02계산기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 입력 : ");
		int num2 = sc.nextInt();
		char op = '-';

		System.out.println(cal(num1, num2, op));

	}

	// private : 다른 클래스에서는 사용할 수 없게 막는 접근제한자
	private static int cal(int num1, int num2, char op) {
		int result = 0;

		// op가 어떤 모양인지에 따라서 달라져야함
		// 조건을 비교해야함 -> +, -, *, /
		if (op == '+') {
			result = (num1 + num2);
		} else if (op == '-') {
			result = num1 > num2 ? num1 - num2 : num2 - num1;
		} else if (op == '*') {
			result = num1 * num2;
		} else if (op == '/') {
			result = num1 / num2;
		} else {
			// 조건에 맞지 않는 값이 들어왔을 때 내보내줄 결과값
			result = 0;
		}

		return result;

	}

}
