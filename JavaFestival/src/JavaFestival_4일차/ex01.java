package JavaFestival_4일차;

import java.util.Scanner;

public class ex01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("행 개수 : ");
		int row = sc.nextInt();

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}
}
