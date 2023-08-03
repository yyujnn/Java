package 유진;

public class ex21번_거리 {

	public static void main(String[] args) {

		int[] point = { 92, 32, 52, 9, 81, 2, 68 };
		// i 0 1 4 5
		// j 123456 23456 56 6
		int min = (point[0] - point[1]) * (point[0] - point[1]);
		int a = 0, b = 0;

		for (int i = 0; i < point.length - 1; i++) {
			for (int j = i + 1; j < point.length; j++) {
				int dis = (point[i] - point[j]) * (point[i] - point[j]);
				if (dis < min) {
					min = dis;
					a = i;
					b = j;
				}
			}
		}

		System.out.println("reslur = [" + a + ", " + b + "]");

	}

}
