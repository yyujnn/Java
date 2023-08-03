package ArrayList;

import java.util.ArrayList;

public class StudentMain {

	public static void main(String[] args) {
		// ArrayList
		// : 크기가 가변적인 배열과 같은 형태를 가진!! 클래스!!
		
		// 1. ArrayList 생성
		// : 레퍼런스 타입의 데이터만 저장할 수 있다.
		// ex) String, Student, Pokemon..etc
		
		
	
		  // 1. Student 자료형 보관할 수 있는 sList 라는 이름을 가진 ArrayList 생성해보자
	      ArrayList <Student> sList = new ArrayList <Student> ();
	      // <> 에는 자료형 투입. Student ㄱㄱ
	      // 2. 데이터 추가(짝꿍의 이름, 나이를 가지고 있는 데이터를 추가하기.
	      //sList.add()
//	      Student s1 = new Student("김운비", 20);
//	      sList.add(s1);             <-- 이렇게 굳이 할 필요가 없으므로
	      
	      sList.add(new Student("김운비", 20)) ; // <-- 메소드 안에 바로 생성. 
	      
	      // 3. 짝꿍의 이름 출력!
	      System.out.println(sList.get(0).getName()); 
	      
	      // 본질적으로 어떤 자료형인지 확인할 것!
	      // sList.get(0) --> return type : Student --> 객체
	      
	      // 4. 팀원 데이터 전부 추가하기
	      sList.add(new Student("정유진", 24));  // --> 위에 운빈쌤 있으니까 1번부터 시작
	      sList.add(new Student("김수진", 26));  // 2번
	      sList.add(new Student("정진우", 32));   // 3번 ...
	      sList.add(new Student("이상원", 00));
	      sList.add(new Student("김성록", 00));
	      
	      // 5. 팀원 이름 전부 출력하기
	      
	      for (Student s :sList){  // 데이터타입 변수 : 반복할것
	         System.out.print(s.getName()+"\t");
	      }
	      System.out.println();
	      
	      for (Student s :sList){
	         System.out.print(s.getAge()+"\t");
	      }
	      
	      

		
		
		
		
		
		
		
		
		
	}

}
