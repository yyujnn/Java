package 메소드;

public class ex01더하기 {

	public static void main(String[] args) {
		// 메소드 사용하기 (main 영역 안쪽에서 사용하기)
		double result = addDouble(4.2, 3.14);
		System.out.println(result);

		int result2 = subNum(3, 3);
		System.out.println(result2);
		
		System.out.println(subNum(4,10));
		printHello();

	}
	// 메소드 생성 (main 영역을 벗어나서 작성하기)
	// 1. 더하기
	// 매개변수 double 2개 / 리턴타입 double / 메소드명 addDouble

	public static double addDouble(double n1, double n2) {
		
		// 메소드는 return 키워드를 만나면 데이터를 반환하고 끝난다
		// 즉, return 키워드 위쪽에만 코드를 작성할 것
		double result = n1 + n2;
		return result;
	}

	// 2. 빼기를 수행하는 메소드
	// 리턴타입 : int / 매개변수 : int 2개 / 메소드명 : subNum
	// 단, 큰 수에서 작은 수를 뺀 결과값 돌려주기

	public static int subNum(int n1, int n2) {
		int result = 0;

		result = n1 > n2 ? n1 - n2 : n2 - n1;
//		if (n1 > n2) {
//			result = n1 - n2;
//		} else {
//			result = n2 - n1;
//		}
		return result;
	}
	
	// 3. Hello World를 출력하는 메소드
	public static void printHello() {
		// void : 리턴타입이 없음을 의미하는 키워드
		System.out.println("Hello World");
	}
	
	
	

}
