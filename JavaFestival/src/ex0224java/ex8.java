package ex0224java;

import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		int num2 = 0;
		
	    if(num%10>=5) {
	    	num2=num+(10-num%10);
	    	
	    	
	    }else {
	    	num2=num-num%10;
	    }
	    System.out.println(num2);

		
	}

}
