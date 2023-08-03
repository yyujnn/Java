package 입출력;


// 도구를 꺼내올 때는 반드시 어디에서 꺼내올 지 import 구문을 작성
// --> 직접 작성하기 보다는 error에 마우스를 올려서 해결
// --> import 자동완성 단축키 : ctrl shift o
import java.util.Scanner;


public class ex01입출력 {

	public static void main(String[] args) {
		
		// 주석 : 코드에 영향을 끼치지 않는 일종의 메모
		// 단축키
		// 1) 글자 크기 늘리기 : ctrl +
		// 2) 글자 크기 줄이기 : ctrl -
		// 3) 한 줄 삭제 : ctrl d
		// 4) 실행 단축키 : ctrl f11
		
		// 출력문
		//--> () 안쪽에 출력하고 싶은 구문 작성
		System.out.println("Hello World!!!!");
		
		// 출력문 생성 단축키 : syso -> ctrl space
		System.out.println("유진");
		
		
		// 입력문
		// 1. 입력을 도와주는 도구를 꺼내오기
		Scanner sc = new Scanner(System.in);
		// 2. 입력 받을 수 있는 구문 작성
		sc.next();
		
		
		
		
		
	}

}
