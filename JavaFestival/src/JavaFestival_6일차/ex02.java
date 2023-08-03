package JavaFestival_6일차;

public class ex02 {
	public static void main(String[] args) {

		int[][] array = new int[5][5];
		int num = 1;
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < array[i].length; j++) {
					array[i][j] = num++;
				}
			} else {
				for (int j = array[i].length - 1; j >= 0; j--) {
					array[i][j] = num++;
				}
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
