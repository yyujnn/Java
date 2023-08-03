package 상속기초;

public class Child extends Parent {
	// 자식클래스, 새로운클래스, 서브클래스
	// extend  --> 연장하다, 확장하다의 의미
	// : class를 선언하는 구간에 적는다
	
	
	// 1. 김치찌개 메뉴를 만든다
	/**
	 * 김치찌개 메뉴를 만드는 메소드
	 * @author 정유진
	 * @since 23.02.27
	 * @return void
	 * @param 매개변수 없음
	 */
	
	
	public void makeKimchi() {
		System.out.println("아주아주 맛있는 김치찌개를 만든다~!");
	}
	
	// 2. 부모님 가게의 삼겹살 + 소주 메뉴를 변경
	@Override // annotation(주석) -- > 특정 기능을 가지고 있는 것은 아님!
	// --> 자동완성된 메소드 위에 마우스를 올렸을 때 포스트잇 모양에 표시해주는 역할!
	
	public void makeSamSo() {
		System.out.println("1등급 삼겹살을 굽는다!! 얍!");
		
	}
	// 메소드 오버라이딩(method overriding)
	// : 상속이 전제되어있어야 한다!
	// : 부모 클래스가 가지고 있는 메소드의 틀(리턴타입, 메소드명, 매개변수)을
	//   그대로 가지고 와서 {} 안쪽만 ★★재정의★★ 하는 기법
	
	// 오버라이딩 - 재정의
	// 오버로딩 - 중복정의
	
	
	
	
	
	
	
	
	
	
	
	
	
}
