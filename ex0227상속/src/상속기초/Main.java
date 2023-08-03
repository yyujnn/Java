package 상속기초;

public class Main {

	public static void main(String[] args) {

		// 1. Parent 자료형 p 객체 생성
		Parent p = new Parent();
		
		// 2. Child 자료형 c 객체 생성
		Child c = new Child();
	
		p.makeSamSo();
		// 메소드 오버라이딩을 한다면, 오버라이딩한 메소드를 호출!
		c.makeSamSo();
		// --> 상속을 사용했기 때문에 부모클래스가 가지고 있는 메소드를 
		//     재사용하는 것이 가능하다!!!!!!
		
		c.makeKimchi();

		
		
		// 객체의 Casting(형변환)
		// Reference Type에서의 형변환은 반드시 상속이 전제되어있어야한다.
		// --> 객체 내 필드, 메소드의 접근권한을 기준으로 강제 vs 자동 결정!
		
		// 1) UpCasting (업캐스팅)
		// : 자식(서브, 하위) 클래스가 부모(슈퍼, 상위) 클래스 타입으로
		//   자동으로 형변환하는 것
		// ex) 고양이는 동물이다 -> 말됨 자동으로 형변환
		//     동물은 고양이다 -> 말 안됨
		Parent p2= new Child();
		// 부모자료형 레퍼런스변수명 = new 자식자료형();
		p2.makeSamSo();
		// 만약에, 자식 클래스가 부모클래스의 메소드를 재정의(오버라이딩) 한 경우
		// UpCasting된 객체는 자식클래스(재정의 되어있는)의 메소드 호출
		
		
		// 2. DownCasting(다운캐스팅)
		// : 부모 클래스가 자식 클래스로 강제 형변환
		// Child c2 = (Child) new Parent();
		// 코드에서 빨간 줄이 뜬다 == syntax Error(구문 오류)
		// Exception 발생 !
		// : 구문 오류는 없으나 실행했을 때 예외상황이 발생하는 것!
		// : Exception종류 자바 책 153.p 참고
	
		
		// 3. DownCasting(다운캐스팅)
		// : 업 캐스팅 된 객체를 강제 형변환으로 본래의 자료형태로 되돌려놓는 것
		// 전제조건 : 업캐스팅 된 객체만 다운캐스팅 가능하다!
		Child c2 = (Child)p2;
		c2.makeKimchi();
		// --> 본래 자신이 가지고 있던 메소드를 사용할 수 있음
		
		
		
		
		
		
		
		
		
		
	}

}
