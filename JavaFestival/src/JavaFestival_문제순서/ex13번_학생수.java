package JavaFestival_문제순서;

public class ex13번_학생수 {

	public static void main(String[] args) {

		String score = "A,A,B,C,D,A,C,D,D,D,F";
		String[] arr = score.split(",");
		int a = 0, b = 0, c = 0, d = 0, f = 0;
		for (int i = 0; i < arr.length; i++) {

			switch (arr[i]) {
			case "A":
				a++;
				break;
			case "B":
				b++;
				break;
			case "C":
				c++;
				break;
			case "D":
				d++;
				break;
			case "F":
				f++;
				break;
			}
		}
		System.out.println("A : " + a + "명");
		System.out.println("B : " + b + "명");
		System.out.println("C : " + c + "명");
		System.out.println("D : " + d + "명");
		System.out.println("F : " + f + "명");

	}

}
