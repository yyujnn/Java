package JavaFestival_문제순서;

public class ex12번_이차원배열1 {

	public static void main(String[] args) {

		int[][] array = new int[5][5];
		int num = 1;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[j][i] = num++;
			}
		}

		// 출력
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
