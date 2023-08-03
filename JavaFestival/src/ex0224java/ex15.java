package ex0224java;

import java.util.Scanner;

public class ex15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n :");
		int num= sc.nextInt();
		int num1=1;
		for (int i=1;i<num+1;i++) {
			
			
			System.out.println(num1+" ");
			num1=num1+i;
		}
	}
}
