package JavaFestival_문제순서;

import java.util.Scanner;

public class ex01번_다이어트프로그램 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("현재몸무게 : ");
		int currentWeight = sc.nextInt();

		System.out.print("목표몸무게 : ");
		int targetWeight = sc.nextInt();

		
		int sum = 0;
		int i = 0;

		while (true) {

			i++;
			System.out.print(i + "주차 감량 몸무게 : ");
			int minus = sc.nextInt();
			currentWeight -=minus;
			

			if (currentWeight  <= targetWeight) {
				System.out.println(currentWeight + "kg 달성!! 축하합니다!");
				break;

			} 
			
		}

	}

}
