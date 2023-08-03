package for문;

public class ex03for문예제 {

	public static void main(String[] args) {

		 // 2단 출력
		for (int i = 1; i < 10; i++) {
			System.out.println("2*" + i + "=" + 2 * i);
		}

		System.out.println();

		
		// 1~9단 출력
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
			}
		}
	
		
		
		

	}

}
