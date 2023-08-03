package 상속기초;

public class 상속개념 {
	
	/*

	 Java의 상속
	 : 기존 클래스의 변수(데이터)와 메소드(로직, 코드)를 
	    물려받아 새로운 클래스를 구성하는 것
	    
	 부모 클래스, 슈퍼 클래스  
	        ↑ (재사용 + 추가기능)
	 자식 클래스, 서브 클래스 
	 
	 
	 상속의 장점
	 - 기존 클래스의 변수와 코드를 재사용 - > 코드의 중복 감소 클래스 간결과
	 - 먼저 작성된 검증된 프로그램을 재사용 -> 신뢰성 있는 프로그램 손쉽게 개발
	 - 클래스 간 계층적 분류 및 관리 -> 유지보수 용이
	 
	 class 서브클래스 extends 슈퍼클래스
	 
	 
	 상속의 특징
	 1) 다중상속을 지원하지 않는다 
	    --> 자식은 하나의 부모클래스만 가져야함, 부모는 자식을 여러개 가질 수 있음
	 2) 상속의 횟수에 제한을 두지 않는다 
	 3) 모든 클래스는 java.lang.Object(최상위클래스)를 상속받는다 
	    --> Object == 클래스 공통의 조상
		
	 Casting(캐스팅)
	 기존 데이터 타입을 다른 데이터타입으로 변환하는 것
	 
	 Primitive Type - 데이터 공간의 크기 > 자동형변환/강제형변환
	 Reference Type - 객체 내 필드, 메소드의 접근 권한 > 업캐스팅/다운캐스팅
	 
	 UpCasting(업캐스팅) ★★
	 - 하위클래스가 상위 클래스 타입으로 자동 타입 변환하는 것 (다형성)
	 - 객체 내 모든 변수, 메소드에 접근할 수 없고
	   상위 클래스의 변수, 메소드에만 접근 가능
	 - 단, 하위 클래스가 상위 클래스의 메소드를 오버라이딩한 경우
	   하위 클래스의 메소드를 호출
	 > tip 객체에서의 형변환은 상속이 전제되어 있다.
	 > 자식이 부모가 되는 것
	 
	 DownCasting(다운캐스팅)
	 - 업캐스팅된 객체를 강제(명시적) 타입 변환으로 다시 되돌리는 것
	 - 업캐스팅된 객체가 아니더라도 문법적인 오류는 없지만, 실행 후 compile 시 문제가 발생한다
	 ex) Child c =(Child) new Parent
	 > 부모가 자식이 되는 것 


	추상화
	- 클래스 간의 공통점을 찾아내서 공통의 조상을 만드는 일 

	추상 메소드
	- 선언되어 있으나 구현되어있지 않은 메소드(중괄호가 없는 메소드)
	- abstract 키워드를 사용하여 선언
	 ex) public abstract int getValue();
	- 추상 메소드는 서브클래스(자식 클래스)에서 오버라이팅 필수
	
	추상 클래스
	- 추상 메소드를 하나라도 가진 클래스
	- abstract 키워드를 사용하여 선언
	 ex) public abstract class Parent
	 > tip 추상 클래스는 일반 메소드를 가질 수 있다
	       일반 메소드만 가지고 있더라도 추상 클래스로 만들 수있다
	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
	 추상 클래스 특징
	 1) 추상클래스의 객체는 생성할 수 없다
	 2) 추상 클래스 필요성
	   - 상속 관계에서 서브클래스가 반드시 구현 해야 함을 알릴 때(강제성)
	   - 설계와 구현 분리
	     > 슈퍼클래스에서는 개념적 특징 정의
	     > 서브클래스에서 구체적 행위 구현
	       
	       
	       
	       
	       
	       
	       
	       



	 */
	
	

}
