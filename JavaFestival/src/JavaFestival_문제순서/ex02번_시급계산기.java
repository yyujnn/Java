package JavaFestival_문제순서;

import java.util.Scanner;

public class ex02번_시급계산기 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("일한시간을 입력하세요 : ");
		int time = sc.nextInt();
		int money = 0;
		if (time > 8) {
			money = (int) (8 * 5000 + 5000 * 1.5 * (time - 8));

		} else {
			money = time * 5000;
		}
		System.out.println("총 임금은 " + money + "원 입니다.");

	}
}
