package OOP기초;

public class Member {
	
	// 나만의 자료형의 설계도면
	// --> main method 포함시키지 않을 것임
	// --> 자체적으로 실행되지는 않음 
	// --> 진짜 설계도면 그 이상 그 이하도 아님
	
	// OOP (Object Oriented Programming)
	
	// 1. Field (Data, 속성)
	String name;
	int age;
	String id;
	String pw;

	
	// 2. Method (Logic, 행위)
	// 카카오톡 메시지 보내기
	public void kakaoTalk(String msg) {
		System.out.println(name+"님이 "+msg+" 를 전송합니다.");
		
	}
	
	// 기프티콘 보내기
	public void gift(String gift) {
		System.out.println(name+"님이 "+gift+" 를 선물합니다.");
	}
	
	


}
