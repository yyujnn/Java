package JavaFestival_5일차;

import java.util.Random;

public class ex03로또 {

	public static void main(String[] args) {

		// 중복 없이 숫자 뽑는 로또 프로그램 
		
		int arr[] = new int[6];
		Random ran = new Random();
		for (int i = 0; i < arr.length; i++) {
			System.out.print("행운의숫자 : ");
			arr[i] = ran.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--;
				}
			}
			System.out.println(arr[i]);

		}
	}

}
