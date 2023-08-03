package JavaFestival_3일차;

public class ex01plusminus {
	public static void main(String[] args) {

		// 1-2+3-4+...+99-100
		
		int sum = 0;
		int num = 0;
		
		for (int i = 1; i <= 100; i++) {

			if (i % 2 == 1) {

				num = i;

			}

			else if (i % 2 == 0) {
				num = i * (-1);
			}

			sum += num;

			System.out.print(num + " ");
		}
		System.out.println("\n결과 : " + sum);
	}

}
