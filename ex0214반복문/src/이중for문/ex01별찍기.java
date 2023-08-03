package 이중for문;

public class ex01별찍기 {

	public static void main(String[] args) {

		// *****
		// 안에 있는 for문 먼저 만들기
		for (int i = 0; i < 5; i++) {
			System.out.println();
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
		}

	}

}
