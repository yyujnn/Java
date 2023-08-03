package 배열;

import java.util.Scanner;

public class ex07수박게임 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("====수박 게임 start~!====");
		char[] data = { '수', '박' };
		System.out.print("숫자를 입력하세요 >> ");
		int input = sc.nextInt();
		for (int i = 1; i <= input; i++) {
			if (i % 2 == 1) {
				System.out.print(data[0]);
			} else {
				System.out.print(data[1]);
			}

		}

	}

}
