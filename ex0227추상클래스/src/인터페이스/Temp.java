package 인터페이스;

public interface Temp {
	// 인터페이스란 ?
	// : 클래스들이 공통으로 구현해야하는 기능들을 정의
	// : 프로젝트 설계도면 or 작업명세서 (지켜야하는 규칙)
	
	// 인터페이스의 특징
	// 1. 필드에 들어갈 수 있는 데이터는 반드시 상수여야한다.
	// 2. static 키워드가 있는 필드만 선언 가능하다.
	// --> 정적인 고정적인 저장공간
	// --> 1순위로 실행되는 저장공간
	// 3. 필드에서 static 키워드와 final 키워드 생략 가능하다 !
	// 4. 인터페이스는 추상 메소드만 가질 수 있다.
	// 5. 메소드 선언 시 abstract 생략이 가능하다.
	// 6. 접근제한자 protected 사용 불가능하다.
	// 7. implements 키워드를 사용해서 상속 받을 수 있다.
	// 8. 인터페이스는 다중상속 가능하다.
	
	// 추상클래스는 IS-A "~이다"
	// 인터페이스는 HAS-A "~을 할 수 있는"
	// 해당클래스 구분을 추상클래스 상속을 통해 해결, 할 수 있는 기능 인터페이스
	
	// 1. 필드
	
	public int num = 0;
	
	
	
	// 2. 메소드
	public void temp();
	
	// Java 7버전 이후
	// --> default static 키워드가 있으면 일반 메소드 선언 가능
	static void temp2() {
		
	}
	

	
	
	
	
	
	
	
	

}
