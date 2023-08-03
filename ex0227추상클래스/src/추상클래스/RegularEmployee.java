package 추상클래스;

public class RegularEmployee extends Employee {

	// 필드

	private int bonus;

	public RegularEmployee(String empno, String name, int pay, int bonus) {
		super(empno, name, pay);
		this.bonus = bonus;
	}

	public int getMoneyPay() {
		return (pay + bonus) / 12;
	}

	

}
