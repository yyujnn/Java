package 유진;

public class ex03번_plusminus {

	public static void main(String[] args) {

		int sum = 0;
		int num = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				num = i;

			} else {
				num = (-1) * i;
			}
			System.out.print(num + " ");
			sum += num;

		}

		System.out.println("\n결과 : " + sum);

	}

}
