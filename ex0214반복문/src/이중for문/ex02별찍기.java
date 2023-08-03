package 이중for문;

public class ex02별찍기 {

	public static void main(String[] args) {

		// 역삼각형
		for (int j = 1; j <= 5; j++) {

			for (int i = 5; i >= j; i--) {

				System.out.print("*");
			}
			System.out.println("");
		}

		System.out.println();

		// 삼각형
		for (int j = 1; j <= 5; j++) {

			for (int i = 1; i <= j; i++) {

				System.out.print("*");
			}
			System.out.println("");
		}
		
		

		


		System.out.print("*");
		System.out.println();

		System.out.print("*");
		System.out.print("*");
		System.out.println();

		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.println();

		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.println();

		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.println();
		
		
		
		

	}

}
