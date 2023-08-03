package JavaFestival_5일차;

import java.util.Arrays;
import java.util.Scanner;

public class ex07오름차순 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "번째 수 입력 : ");
			arr[i] = sc.nextInt();
		}

		// i 0123
		// j 1234 234 43 4
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.println("정렬 후");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		// ----------- 다시
		// i 0 1 2 3
		// j 1234 234 34 4
		System.out.println();
		int[] array = { 9, 8, 5, 7, 2 };
		System.out.println(Arrays.toString(array));
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(array));

	}

}
