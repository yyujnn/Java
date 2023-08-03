package 배열;

import java.util.Arrays;
import java.util.Random;

public class ex05가장큰수 {

	public static void main(String[] args) {

		int[] array = new int[5];
		Random ran = new Random();

		int max = 0;

		System.out.print("배열 안에 들어있는 값 : ");
		for (int i = 0; i < 5; i++) {
			array[i] = ran.nextInt(10) + 1;
		
				if (max < array[i]) {
					max = array[i];
				}
	

		}

		System.out.println(Arrays.toString(array));

		System.out.println("가장 큰 값은 " + max + "입니다.");

	}
}