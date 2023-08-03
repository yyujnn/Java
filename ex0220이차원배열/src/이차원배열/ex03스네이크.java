package 이차원배열;

public class ex03스네이크 {

	public static void main(String[] args) {

		int array[][] = new int[5][5];
		int num = 21;
		for (int i = 0; i < array.length; i++) {

			if (i % 2 == 0) {
				for (int j = 0; j < array[i].length; j++) {
					array[i][j] = num++;

				}
			} else {
				for (int j = 4; j >= 0; j--) {
					array[i][j] = num++;
				}

			}
		}

		for (int i = 0; i < array.length; i++) { // 행
			for (int j = 0; j < array[i].length; j++) { // 열
				System.out.print(array[i][j] + "\t");
				// 정규표현식 (tab) : 기호가 컴퓨터에서 특정 의미를 갖고 있다.
			}
			System.out.println();

		}

	}

}
