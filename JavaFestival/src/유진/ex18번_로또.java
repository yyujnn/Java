package 유진;

import java.util.Random;

public class ex18번_로또 {

	public static void main(String[] args) {

		Random ran = new Random();

		// 비교
		// i- 0 1 2 3 4 5
		// j- 0 01 012 0123 01234
		// 다시 뽑은 lotto[i]를 비교해야됨

		int[] lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			System.out.print("행운의 숫자 : ");
			lotto[i] = ran.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
				}

			}
			System.out.println(lotto[i]);
		}

	}

}
