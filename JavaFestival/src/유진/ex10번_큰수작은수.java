package 유진;

import java.util.Random;

public class ex10번_큰수작은수 {

	public static void main(String[] args) {

		int[] array = new int[8];

		System.out.print("배열에 있는 모든 값:");

		Random ran = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = ran.nextInt(100) + 1;
			System.out.print(" " + array[i]);
		}

		int max = array[0], min = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
			if (array[i] < min) {
				min = array[i];
			}

		}

		System.out.println("\n가장 큰 값 : " + max);
		System.out.println("가장 작은 값 : " + min);

	}

}
