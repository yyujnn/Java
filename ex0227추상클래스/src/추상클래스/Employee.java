package 추상클래스;

public abstract class Employee {

	
	// 접근제한자
	// 클래스 변수와 메소드를 외부(다른 클래스)에서 접근할 수 있는 범위를 지정
	// public(모든클래스) > protected(상속관계, 같은패키지) > default(같은패키지) > private (같은클래스)
	 
	protected String empno;
	protected String name;
	protected int pay;
	
	
	
	public Employee(String empno, String name, int pay) {
		super();
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}
	
	public abstract int getMoneyPay();
	
	public String print() {

		return empno + " / " + name + " / " + pay;
	}

}
