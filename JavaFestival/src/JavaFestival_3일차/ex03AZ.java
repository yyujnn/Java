package JavaFestival_3일차;

public class ex03AZ {

	public static void main(String[] args) {

		// for문 사용 A~Z 출력
		System.out.println("10 | 16   | 문자");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

		for (int num = 65; num <= 90; num++) {

			// 아스키코드
			char cha = (char) num;
			// 16진수
			String hexString = Integer.toHexString(num);

			System.out.println(num + " | 0x" + hexString + " | " + cha);

		}

	}

}
