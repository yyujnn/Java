package for문;

import java.util.Scanner;

public class ex04구구단 {

	public static void main(String[] args) {

		// 원하는 단 입력 받아 구구단 출력 
		Scanner sc = new Scanner(System.in);
		System.out.print("단 입력 : ");
		int input = sc.nextInt();
		for (int i = 1; i < 10; i++) {
			System.out.println(input + "*" + i + "=" + input * i);
		}

	}

}
