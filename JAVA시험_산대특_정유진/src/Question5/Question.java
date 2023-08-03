package Question5;

public class Question {

	public static void main(String[] args) {
		goBusan(new Train());
		goBusan(new Bus());
		goBusan(new Airplain());


	}
	private static void goBusan(Busan b) {
		b.go();
	}

}
