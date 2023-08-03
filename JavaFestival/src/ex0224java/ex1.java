package ex0224java;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재몸무게 : ");
		int current=sc.nextInt();
		System.out.print("목표몸무게 : ");
		int goal = sc.nextInt();
		
		int cnt=1;
		int num=0;

		while(true) {
			
			System.out.print(cnt+"주차 감량 몸무게: ");

			num=sc.nextInt();
			current = current-num;
			
			if(current<=goal) {
				System.out.println(current+"kg 달성!! 축하합니다!");
				break;
			}
			cnt++;
			
		}
		
		
		
		
		
		
		
	}

}
