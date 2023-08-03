package 이중for문;

public class ex03별찍기 {

	public static void main(String[] args) {

		// 공백 삼각형
		for (int j = 1; j <= 5; j++) {

			for (int i = 5; i >= 1; i--) {

				if (i > j) {

					System.out.print(" ");
				} else {

					System.out.print("*");
				}

			}

			System.out.println();

		}

		System.out.println();

		// * 공백 삼각형
		// j 01234
		// 공백 43210
		// 별 12345
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 4 - j; i++) {
				System.out.print(" ");
			}

			for (int i = 0; i < j + 1; i++) {
				System.out.print("*");
			}
			System.out.println();

		}

		// 피라미드
		// 공백 43210
		// 별 13579
		// j 56789

		for (int i = 1; i <= 5; i++) {

			for (int j = 0; j < 4 + i; j++) {
				if (j >= 5 - i) {
					System.out.print("*");
				} else {
					System.out.print(" ");

				}

			}
			System.out.println(" ");

		}
		// 피라미드
		// i 0 - j 4,1
		// 1 - 3,3
		// 2 - 2,5
		// 3 7
		// 4 9

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4 - i; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();

		}

		// 역피라미드
		// i 0 - j 0,9
		// 1 - 1,7
		// (7번 실행돼야함 -> 9부터 3까지 7번 j의 값이 9876543)
		// j>2*1 >> j가 3까지 나와야하기 때문에 부등호 뒤 값 2가 되어야함
		// 2 - 2,5
		// 3 3,3
		// 4 4,1
		//

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 9; j > 2 * i; j--) {
				System.out.print("*");
			}
			System.out.println();

		}

	}

}
