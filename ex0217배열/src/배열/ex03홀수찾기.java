package 배열;

import java.util.Random;

public class ex03홀수찾기 {

	public static void main(String[] args) {

		int[] array = new int[5];
		Random ran = new Random();
		System.out.print("array에 들어있는 홀수는 ");
		int num = 0;
		for (int i = 0; i < array.length; i++) {

			array[i] = ran.nextInt(100) + 1;
			if (array[i] % 2 == 1) {
				System.out.print(array[i] + " ");
				num++;
			} 
		}
		
		System.out.println("이며,");
		System.out.println("총" + num + "개 입니다.");
		

	}

}
