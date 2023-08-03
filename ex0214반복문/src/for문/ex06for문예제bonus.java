package for문;

public class ex06for문예제bonus {

	public static void main(String[] args) {

		int sum = 0;
		int j = 0;
		for (int i = 77; i > 0; i--) {

			j++;
			sum += i * j;

			System.out.print("(" + i + "*" + j + ")+");

		}
		System.out.println("\n" + sum);

	}

}
