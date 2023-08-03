package 닌텐도게임;
// 닌텐도에 들어갈 수 있는 게임칩의 공통의 부모 클래스
public abstract class GameChip {
	// 1. 추상 클래스 
	// - 추상메소드를 하나라도 가지고 있다면 반드시 추상클래스가 되어있어야한다.
	// - 추상클래스도 일반 메소드를 가지고 있을 수 있다.
	// - abstract 키워드를 사용해 선언한다. > 클래스 앞
	
	public void temp() {
		System.out.println("임의로 만든 메소드");
	}
	
	
	public abstract void gameStart();
	// 2. 추상 메소드
	// - {}가 없는 메소드
	// - 선언(틀 : 리턴타입, 매개변수, 메소드명)은 되어있으나 
	//   로직이 구현되지 않은 메소드
	// - abstract 키워드를 사용해 선언한다. > 리턴타입 앞
	
	
	
	
	

}

