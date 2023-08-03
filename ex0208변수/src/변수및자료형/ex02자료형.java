package 변수및자료형;

public class ex02자료형 {
	
	public static void main(String[] args) {
		
		// main을 못 만들었다면 
		// main ctrl space --> 자동완성 가능
		// snippet (코드 조각)
		
		// 기본 자료형
		// 1) 논리 자료형 : boolean (1byte)
		// 참이라는 데이터를 저장하는 bool 변수 선언
		boolean bool = true; // false
		System.out.println(bool);

		// 2) 문자 자료형 : char (2byte)
		// -->  따옴표를 사용해서 작성하고 한 글자만 들어갈 수 있다
		char name = '김';
		System.out.println(name);
		
		// 문자열 자료형 (기본 자료형은 아님)
		// String --> 쌍따옴표 사용해서 작성하고 여러 글자 들어갈 수 있다
		String name2 ="김운비";
		System.out.println(name2);
		
		
		// 3) 정수 자료형 
		// byte(1), short(2), int(4), long(8)
		// --> 데이터의 크기가 의미하는 건 표현할 수 있는 범위
		// 정수를 작성하면 java는 기본적으로 int로 인식
		byte num = (byte) 128;
		// 명시적 형변환 (강제 형변환) 
		// --> 큰 크기를 가진 데이터 자료형을 작은 크기의 자료형으로 옮기는 작업 -> 데이터 손실이 발생해도 괜찮을 때
		// --> 강제적으로 형을 변환하고 싶을 때 사용
		
		// 묵시적 형변환 (자동 형변환)
		// --> 자동으로 자료형 변환 
		// --> 작은 크기를 가진 데이터 자료형을 큰 크기의 자료형으로 옮겨 담을 때 자동으로 자료형이 변환
		long num2 =12345;
		
		System.out.println(num);
		System.out.println(num2);
		
		// 4) 실수형
		// float(4byte), double(8byte) >> 기본값 double
		// 3.14라는 데이터를 담는 float 형태의 변수 num3를 선언
		float num3 = (float) 3.14;
		float num4 = 3.14f;
		
		System.out.println(num4);
		

		
		
		
		
	}

}
