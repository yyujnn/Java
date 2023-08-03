package ex0224java;

import java.util.Scanner;

public class ex20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력>>");
		int num = sc.nextInt();
		String str = "";
		
		while (true) {
			
			if(num==1) {
				
				str = "1 "+str;
				
				break;
				
			}
			str = num%2 +" "+str;
			
			num= num/2;
			
		}
		System.out.println(str);
		
		// num= 10 -> 0, 01, 101, 1010
	
			
		
		
	}

}
