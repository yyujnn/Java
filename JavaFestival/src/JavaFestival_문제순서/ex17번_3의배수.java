package JavaFestival_문제순서;

import java.util.Scanner;

public class ex17번_3의배수 {

	public static void main(String[] args) {

		// 숫자를 입력 받아 3의 배수인 숫자를 출력
		
		Scanner sc = new Scanner(System.in);
		int array[] = new int[10];
		int three = 0;

		for (int i = 0; i < array.length; i++) {
			System.out.print((i + 1) + "번째 정수 입력>>");
			array[i] = sc.nextInt();

		}
		System.out.print("3의 배수 : ");
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 3 == 0) {
				System.out.print(array[i] + " ");
			}

		}

	}

}
