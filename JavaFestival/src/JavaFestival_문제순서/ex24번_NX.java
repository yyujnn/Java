package JavaFestival_문제순서;

import java.util.Scanner;

public class ex24번_NX {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("N 입력 >> ");
		int N = sc.nextInt();
		System.out.print("X 입력 >> ");
		int X = sc.nextInt();

		int[] arr = new int[N];
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "번째 정수 입력>> ");
			arr[i] = sc.nextInt();
		}
		System.out.print("결과 >>");
		for (int i = 0; i < N; i++) {
			if (arr[i] < X) {
				System.out.print(" " + arr[i]);
			}
		}

	}

}
