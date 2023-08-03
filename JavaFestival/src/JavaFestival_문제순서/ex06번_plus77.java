package JavaFestival_문제순서;

public class ex06번_plus77 {

	public static void main(String[] args) {

		// (77*1)+(76*2)+(75*3)+...+(1*77)
		
		int num = 0;
		int sum = 0;
		for (int i = 77; i > 0; i--) {
			num++;
			sum += i * num;
		}
		System.out.println(sum);

	}

}
