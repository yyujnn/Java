package OOP기초;

public class BankbookMain {

	public static void main(String[] args) {

		// 1. Bankbook 설계도면을 기반으로 bank1 객체 생성

		Bankbook bank1 = new Bankbook();

		// 2. bank1 의 잔액을 1000원 추가
		bank1.deposit(1000);

		// 3. bank1에 7000원 입금
		bank1.deposit(7000);

		// 4. bank1에 5000원 출금
		//bank1.withdraw(5000);
		bank1.withdraw(10000);

		// 5. bank1의 잔액을 출력
		System.out.println("잔액 : " + bank1.showMoney());

	}

}
