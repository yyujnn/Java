package JavaFestival_1일차;

import java.util.Scanner;

public class ex02거스름돈 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("총금액 입력 : ");
		int change = sc.nextInt();

		System.out.println("\n잔돈 : " + change + "원");
		System.out.println("10000원: " + change / 10000 + "원");
		System.out.println("5000원: " + change % 10000 / 5000 + "원");
		System.out.println("1000원: " + change % 10000 % 5000 / 1000 + "원");
		System.out.println("500원: " + change % 10000 % 5000 % 1000 / 500 + "원");
		System.out.println("100원: " + change % 10000 % 5000 % 1000 % 500 / 100 + "원");

	}

}
