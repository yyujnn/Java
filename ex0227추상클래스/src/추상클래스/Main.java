package 추상클래스;

public class Main {

	public static void main(String[] args) {
		// 실행하는 공간

		RegularEmployee regular = new RegularEmployee("SMHRD001", "정유진", 4000, 300);
		TempEmployee temp = new TempEmployee("SMHRD002", "김성록", 3000);
		PartTimeEmployee part = new PartTimeEmployee("SMHRD003", "임경남", 50, 20);

		System.out.println(regular.print());
		System.out.println(temp.print());
		System.out.println(part.print());

	}

}
