package dowhile문;

import java.util.Scanner;

public class ex다이어트프로그램 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("현재몸무게 : ");
		int weight = sc.nextInt();

		System.out.print("목표몸무게 : ");
		int goal = sc.nextInt();

		int week =1;
		while (true) {
			
			System.out.print(week+"주차 감량 몸무게 : ");
			int minus = sc.nextInt();
			week++;
			
			weight -= minus;
			if ( weight<= goal) {
				System.out.println(weight+"kg 달성! 축하합니다!");
				break;
			}
			
		}

	}

}
