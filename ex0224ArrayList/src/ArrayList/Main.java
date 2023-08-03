package ArrayList;

import java.util.ArrayList;

public class Main {

   public static void main(String[] args) {
      

      // collection
      // 클래스들의 집합
      // collection
      // 클래스들의 집합
            
      //  ArrayList <자료형> 변수명 = new ArrayList <자료형> () ; 
      //  -----제네릭 기법---
      // ArrayList <-- 다른 사람들이 사용하는걸 쓰겠다. 
      // :크기가 가변적인 배열과 같은 형태를 가진 !!클래스!!
      
      // 1. ArrayList 생성
      // 레퍼런스 타입의 데이터만!! 저장할 수 있다.
      // ex) String, Student, Pokemon.. 등
      ArrayList<String> list = new ArrayList<String>();
      
      // 2. 데이터 추가하기
      list.add("돈까스");
      list.add("김밥");
      list.add("아구찜");
      
      // 3. 데이터 가져오기
      System.out.println(list.get(2)); // list는 객체이므로 메소드로 가져와서 보여주기      
      // ㅇ번부터 시작하므로, 아구찜이 나온다.
      
      // 4. 데이터를 특정 위치에 추가하기
      list.add(2, "라면");
      System.out.println(list.get(2));
      System.out.println(list.get(3));
      
      // 5. 데이터 삭제하기
      list.remove(1);
      System.out.println(list.get(1));
      
      // 6. 데이터 크기 알아보기
      System.out.println(list.size());
      
      // 7. 데이터 전체 삭제하기
      list.clear();
      System.out.println(list.size());
      
      
   }

}