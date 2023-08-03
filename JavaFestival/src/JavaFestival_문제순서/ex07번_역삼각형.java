package JavaFestival_문제순서;

import java.util.Scanner;

public class ex07번_역삼각형 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("행 개수 : ");
		int row = sc.nextInt();

		// i 0 > j 번 실행 7~1 >0보다 클 때
		// i 1 > j 번 실행 7~2 >1보다 클 때
		
		for (int i = 0; i < row; i++) {
			for (int j = 7; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
