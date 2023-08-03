package JavaFestival_5일차;

public class ex05거리 {

	public static void main(String[] args) {

		int[] point = { 92, 32, 52, 9, 81, 2, 68 };
//		i- 0123456
//		j- 123456 , 23456, 3456, 456,56,6
//		point[i]-point[j]

		int a = 0;
		int b = 0;
		int min = (point[0] - point[1]) * (point[0] - point[1]);

		for (int i = 0; i < point.length; i++) {
			for (int j = i + 1; j < point.length; j++) {
				int dis = (point[i] - point[j]) * (point[i] - point[j]);
				if (min > dis) {
					min = dis;
					a = i;
					b = j;
				}

			}

		}
		System.out.println("result = [" + a + ", " + b + "]");
	}

}
