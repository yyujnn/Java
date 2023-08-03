package switch문;

import java.util.Scanner;

public class ex자판기프로그램 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("금액을 입력하세요>>");
		int money = sc.nextInt();

		System.out.println("메뉴를 고르세요.");
		System.out.print("1.이구동성(700원) 2.썬칩(1000원) 3.뽀빠이(500원)>>");
		int menu = sc.nextInt();

		int change = money;

		if (menu == 1) {
			if (money >= 700) {
				change = (money - 700);
			}

			else {
				System.out.println("돈이 부족해요 ㅠㅠ");
			}
		}

		else if (menu == 2) {
			if (money >= 1000) {
				change = (money - 1000);
			}

			else {
				System.out.println("돈이 부족해요 ㅠㅠ");
			}
		} 
		else if (menu == 3) {
			
			if (money>=500) {
				change = (money - 500);
			}

			else {
				System.out.println("돈이 부족해요 ㅠㅠ");
			}
			
		}
		
		System.out.println("잔돈 : "+change+"원");
		
		int a =change/1000;
		int b= change%1000 / 500;
			//(change-a*1000)/500;
		
		int c = change%1000%500/100;
			//(change-a*1000 - b*500)/100;
		
		
		System.out.println("천원: "+a+"개, 오백원: "+b+"개, 백원: "+c+"개");

		
		
		
//	    switch (menu) {
//	    case 1 :
//	    	money2=(money -700);
//	    	break;
//	    case 2 :
//	    	money2=(money -1000);
//	    	break;
//	    case 3 :
//	    	money2=(money -500);
//	    	break;
//	    }
//	    
//	    System.out.println("잔돈:"+money2+"원");
//	    

	}

}
