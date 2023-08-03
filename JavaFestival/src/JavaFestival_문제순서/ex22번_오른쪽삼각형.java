package JavaFestival_문제순서;

public class ex22번_오른쪽삼각형 {

	public static void main(String[] args) {

		// i 0 > 공백 4 4321반복 0보다 클 때, 별 1 1반복
		// i 1 > 공백 3, 별 2

		for (int i = 0; i < 5; i++) {
			for (int j = 4; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
