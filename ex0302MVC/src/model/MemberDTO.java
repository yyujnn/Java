package model;

public class MemberDTO {

	// Model 역할
	// DTO --> Data Transfer Object --> getter, setter 메소드
	// VO --> Value Object --> getter 메소드
	// 1. 필드 ( 아이디, 비밀번호, 이름, 나이, 점수)
	private String id;
	private String pw;
	private String name;
	private int age;
	private int score;

	// 2. 메소드( 모든 매개변수를 받는 생성자 1개, getter 메소드)
	public MemberDTO(String id, String pw, String name, int age, int score) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
		this.score = score;
	}


	// 생성자 오버로딩(중복정의)
	public MemberDTO(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}

	public MemberDTO(String id, String pw, int newScore) {
		this.id = id;
		this.pw = pw;
		this.score = newScore;
	}


	public String getId() {
		return id;
	}

	public String getPw() {
		return pw;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getScore() {
		return score;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setScore(int score) {
		this.score = score;
	}


	@Override
	public String toString() {
		return "아이디: " + id + "\t 비밀번호 : " + pw + "\t 이름 : " + name + "\t 나이 : " + age + "\t점수 : " + score ;
	}
	

}
