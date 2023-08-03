package 메소드;

import java.util.Scanner;

public class ex05완전수구하기 {

	public static void main(String[] args) {

		// 완전수
		// : 자기 자신을 제외한 약수들의 합이 자기 자신과 같은 수
		// 6
		// 1+2+3=6
		Scanner sc = new Scanner(System.in);
		System.out.print("num1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("num2 입력 : ");
		int num2 = sc.nextInt();
		boolean divisor = isDivisor(num1, num2);
		System.out.println(divisor);
		System.out.println();

		System.out.println("약수합 : " + getSum(7));
		System.out.println("완전수 : " + isPerfect(6));
	}

	public static boolean isDivisor(int num1, int num2) {
		boolean result = false;

		if (num1 % num2 == 0) {
			result = true;
		}

		return result;
	}

	public static int getSum(int num) {

		int result = 0;

		for (int i = 1; i < num; i++) {
			// 메소드를 호출한 로직

			// 메소드 구조 안에서 새롭게 메소드를 구현할 수 는 없으나
			// 메소드 자체를 호출해서 사용하는 것은 가능
			if (isDivisor(num, i) == true) {

				result += i;

			}
		}

		return result;
	}

	public static boolean isPerfect(int num) {
		boolean result = false;

		if (getSum(num) == num) {
			result = true;
		}

		return result;
	}

}
