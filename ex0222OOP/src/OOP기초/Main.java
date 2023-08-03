package OOP기초;

public class Main {
	// 실행할 수 있는 공간

	public static void main(String[] args) {

		// 1. 클래스 설계도면을 기반으로 객체를 생성
		// --> 생성 : 메모리에 할당
		// 회원 자료형을 만들기 - 변수명은 member1 명칭
		// 자료형 변수명 = new 자료형();

		Member member1 = new Member();

		// member1 -- > 주소값이 저장되어있는 레퍼런스 변수
		// 레퍼런스 변수가 왜 등장했는지 ?
		// --> 자바에도 저공간이 여러가지로 나누어져있다
		// stack 공간 (작은 데이터), heap 공간 (복잡한 데이터)
		// --> heap 에는 GC(Garbage Collector) 기능이 있음
		// --> 주기적으로 필요없는 데이터들을 정리해줌

		System.out.println(member1);
		System.out.println(member1.name);
		// field에 아무런 값도 넣지 않을 때는 기본 값이 세팅된다
		// String -> null+
		// int --> 0
		// double -> 0.0

		member1.name = "김운비";
		member1.age = 20;
		member1.id = "dnsql";
		member1.pw = "12345";
		System.out.println(member1.name);
		System.out.println(member1.age);
		System.out.println(member1.id);
		System.out.println(member1.pw);

		// 하나의 클래스 설계도면으로 여러개의 객체 생성 가능
		// 회원정보를 저장하는 member2 객체를 생성

		Member member2 = new Member();
		member2.name = "김수진";
		member2.age = 26;
		member2.id = "tnwls";
		member2.pw = "2468";
		System.out.println(member2.name);
		System.out.println(member2.age);
		System.out.println(member2.id);
		System.out.println(member2.pw);

		member2.kakaoTalk("안녕!");

	}

}
