package ifelse문;

import java.util.Scanner;

public class ex0마트계산대프로그램 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("상품의 개수를 입력하세요 : ");
		int num = sc.nextInt();
		
		int money=0;
		
		if(num>=11) {
			money=(int) (10000*num*0.9);
		}
		
		else {
			money=(num*10000);
		}
		 
		System.out.println("가격은 "+money+"원입니다.");
		
		
	}

}


