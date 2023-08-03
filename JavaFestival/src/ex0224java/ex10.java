package ex0224java;

import java.util.Random;

public class ex10 {

	public static void main(String[] args) {
		Random ran = new Random();
		int[] arr = new int[8];
		System.out.println("배열 값 : ");
		for(int i=0;i<8;i++) {
			arr[i]=ran.nextInt(100)+1;
			System.out.print(arr[i]+" ");
		}
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
			if(max<arr[i]) {
				max=arr[i];
			}
			
		}
		System.out.println();
		System.out.println("가장 큰 값 :"+max);
		System.out.println("가장 작은 값 :"+min);
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
