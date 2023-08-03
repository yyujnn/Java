package 포켓몬게임;

public class Pokemon {

	private String name;
	private String type;
	private String skill;
	private int hp;
	private int atk;

	// 생성자
	// 모든 필드의 값을 매개변수로 받아서 객체를 생성하는 순간 채워주는 생성자 하나 만들기
	// 단축키 --> alt shift s -> Generate Constructor using field
	public Pokemon(String name, String type, String skill, int hp, int atk) {
		this.name = name;
		this.type = type;
		this.skill = skill;
		this.hp = hp;
		this.atk = atk;
	}
	

	// name, type, skill, hp, atk --> getter 메소드
	// hp, atk --> setter 메소드

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public String getSkill() {
		return skill;
	}

}
