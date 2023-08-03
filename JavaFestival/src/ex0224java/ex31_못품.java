package ex0224java;

import java.util.Scanner;

public class ex31_못품 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("입력: ");
		int num = sc.nextInt();
		int result =1;
		int count =0;
		for(int i=1;i<=num;i++) {
			result *=num;
			count++;
		}
		System.out.println("출력: "+result);
		
		
	}

}
