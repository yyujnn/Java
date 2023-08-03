package JavaFestival_5일차;

import java.util.Random;

public class ex01큰수작은수 {

	public static void main(String[] args) {

		
		// 8칸 크기의 배열을 선언하고 랜덤수로 초기화
		// 가장 큰 수와 작은 수 출력
		System.out.print("배열에 있는 모든 값 : ");
		int[] array = new int[8];
		Random ran = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = ran.nextInt(100) + 1;
			System.out.print(array[i] + " ");

		}
		int max = 0, min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
			if (array[i] < min) {
				min = array[i];
			}
		}

		System.out.println();
		System.out.println("가장 큰 값 :" + max);
		System.out.println("가장 작은 값 :" + min);

	}

}
