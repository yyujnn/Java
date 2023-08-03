package 배열;

import java.util.Arrays;
import java.util.Random;

public class ex04배열예제 {

	public static void main(String[] args) {
		// 겹치지 않는 로또 번호
		System.out.println("==== 로또타임 =====");
		System.out.println("이번 주 출력 번호는요..! 두구두구두구!!!");

		Random ran = new Random();
		int[] array = new int[5];

		// 2. 배열 안의 값 임의의 값으로 초기화
		array[0] = ran.nextInt(10) + 1;

		for (int j = 1; j < array.length; j++) {
			array[j] = ran.nextInt(10) + 1;

			for (int i = 0; i < j; i++) {

				if (array[j] == array[i]) {
					// j를 한 번 더 검사해야함
					j--; // 중복된 숫자가 발생했다면 다시 인덱스번호를 앞으로 보낼 수 있는 코드
					// 2-- 로 변경 후 위 for문 ++ -> 다시 2번 인덱스 검사
					// 중복 아닐 때까지 계속 인덱스 검사해줌
					break; // 만약 중복된 숫자가 하나라도 발견됐다면 멈추고 올린다
				}
			}
		}

		// 3. 단 배열에 중복된 값을 제거
		// 배열 안의 값 한번에 출력하는 명령어
		System.out.println(Arrays.toString(array));

	}

}
