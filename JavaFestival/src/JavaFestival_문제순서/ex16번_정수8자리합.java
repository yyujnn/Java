package JavaFestival_문제순서;

import java.util.Scanner;

public class ex16번_정수8자리합 {

	public static void main(String[] args) {

		/*
		// 8자리 정수를 입력받아 반복문 활용하여 입력받은 정수의 합 구해 출력

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		int sum = 0;

		for (int i = 1; i <= 8; i++) {

			sum += num % 10;
			System.out.print(num%10 + " ");
			num /= 10;
			

		}
		System.out.println("합은" + sum + "입니다.");
		
		
		*/
		
		System.out.print("정수 입력 : ");
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		int sum=0;
		
		
		for (int i =0;i<8;i++) {
			sum += num%10;
			
			System.out.print(num%10+" ");
			num=num/10;
			
			
			
			
		}
		System.out.println("합은 "+sum+"입니다.");

	
/*
System.out.println(num%10);//8 System.out.println(num/10%10);//7
System.out.println(num/100%10);//6 System.out.println(num/1000%10);//5

System.out.println(num/10/10/10/10/10%10); //3

System.out.println(num/10/10/10/10/10/10/10); //1
*/



	}

}
