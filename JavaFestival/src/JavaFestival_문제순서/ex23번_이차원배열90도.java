package JavaFestival_문제순서;

public class ex23번_이차원배열90도 {

	public static void main(String[] args) {

		int[][] array = new int[5][5];
		int num = 1;
		System.out.println("원본");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = num++;
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("90도 회전");
		// 출력
		num = 1;
		for (int i = 0; i < array[0].length; i++) {
			for (int j = array.length - 1; j >= 0; j--) {
				array[j][i] = num++;
			}
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
