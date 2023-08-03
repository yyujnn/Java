package JavaFestival_2일차;

import java.util.Random;
import java.util.Scanner;

public class ex03랜덤합 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		int chance = 0;

		while (true) {

			int num1 = ran.nextInt(9);
			int num2 = ran.nextInt(9);

			System.out.print(num1 + " + " + num2 + " = ");
			int sum = sc.nextInt();

			if (sum == num1 + num2) {
				System.out.println("SUCCESS ! ");

			}

			else {
				System.out.println("Fail . . .");
				chance++;
				if (chance >= 5) {
					System.out.println("GAME OVER !");
					break;

				}
			}

		}

	}

}
