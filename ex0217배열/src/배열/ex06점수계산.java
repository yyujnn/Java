package 배열;

import java.util.Arrays;
import java.util.Scanner;

public class ex06점수계산 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];

		int sum = 0;

		for (int i = 0; i < 5; i++) {

			System.out.print((i + 1) + "번째 입력>> ");
			array[i] = sc.nextInt();

			sum += array[i];
		}
		int max = 0, min = array[0];

		for (int i = 0; i < 5; i++) {

			if (array[i] >= max) {
				max = array[i];
			}
			if (array[i] <= min) {
				min = array[i];
			}
			sum += array[i];
		}

		System.out.print("입력된 점수 : ");
		System.out.println(Arrays.toString(array));

		System.out.println("최고 점수 : " + max);
		System.out.println("최저 점수 : " + min);
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + (float) sum / 5);

	}

}
