package JavaFestival_문제순서;

import java.util.Scanner;

public class ex27번_채점 {

	public static void main(String[] args) {

		System.out.println("=== 채점하기 ===");
		Scanner sc= new Scanner(System.in);
		String input = sc.next();
		String[] arr = input.split("");
		
		int count=0;
		int sum =0;
		
		for(int i=0;i<arr.length;i++) {
			switch(arr[i]) {
			case "o" :
				count ++;
				sum +=count;
				break;
			case "x":
				count =0;
				break;
			}
		}
		System.out.println(sum);
		
		
		
	}

}
