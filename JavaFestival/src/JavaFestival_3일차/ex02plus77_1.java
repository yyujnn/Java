package JavaFestival_3일차;

public class ex02plus77_1 {

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
