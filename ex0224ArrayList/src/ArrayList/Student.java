package ArrayList;

public class Student {

	// 필드
	// 이름, 나이
	private String name;
	private int age;

	
	// 메소드
	// getter, setter
	// 생성자 (모든 필드값을 채우는 생성자)
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
	
	
	
	
}
