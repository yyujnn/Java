package ex0224java;

import java.util.Scanner;

public class ex16 {

	public static void main(String[] args) {

		System.out.print("정수 입력: ");
		Scanner sc = new Scanner(System.in);
		
	
		int num=sc.nextInt();
		int sum=0;
		int count =0;
		// 
		//
		
		for(int i=0;i<8;i++) {
			count=num%10;
			num=num/10;
			
			sum+=count;
			
		}
		System.out.println("합은 "+sum+"입니다.");
		
		
		
		
		
		
		
	}

}
