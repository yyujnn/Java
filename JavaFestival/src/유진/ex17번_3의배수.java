package 유진;

import java.util.Scanner;

public class ex17번_3의배수 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			System.out.print((i + 1) + "번 째 정수 입력>>");
			array[i] = sc.nextInt();
		}
		
		System.out.print("3의 배수: ");
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 3 == 0) {
				System.out.print(" " + array[i]);
			}
		}

	}

}
