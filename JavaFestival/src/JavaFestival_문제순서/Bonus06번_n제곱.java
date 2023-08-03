package JavaFestival_문제순서;

public class Bonus06번_n제곱 {

	public static void main(String[] args) {

		int base = 10;
		int n = 3;
		int result = powerN(base, n);
		System.out.println("결과확인 : " + result);

	}

	public static int powerN(int base, int n) {
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result *= base;

		}

		return result;
	}

}
