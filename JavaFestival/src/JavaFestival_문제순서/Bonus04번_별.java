package JavaFestival_문제순서;

import java.util.Scanner;

public class Bonus04번_별 {

	public static void main(String[] args) {

		// 사용자에게 입력받아 배열의 인덱스 수만큼 별을 출력
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + "번째 별의 수 : ");
			arr[i] = sc.nextInt();

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ":");
			for (int j = 0; j < arr[i]; j++) {

				System.out.print("*");
			}
			System.out.println();
		}

	}

}
