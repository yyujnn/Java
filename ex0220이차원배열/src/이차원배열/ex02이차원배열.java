package 이차원배열;

public class ex02이차원배열 {

	public static void main(String[] args) {

		int arr[][] = new int[5][5];

		// 배열 안에 값 입력
		int num = 21;
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				arr[j][i] = num++;

			}
		}
		
		// 행, 열 출력문
		for (int i = 0; i < arr.length; i++) { // 행
			for (int j = 0; j < arr[i].length; j++) { // 열
				System.out.print(arr[i][j] + "\t");
				// 정규표현식 (tab) : 기호가 컴퓨터에서 특정 의미를 갖고 있다.
			}
			System.out.println();

		}

	}

}
