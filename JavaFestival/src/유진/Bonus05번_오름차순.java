package 유진;

import java.util.Arrays;
import java.util.Scanner;

public class Bonus05번_오름차순 {

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
			System.out.print(arr[i] );
		}
		
		
	}

}
