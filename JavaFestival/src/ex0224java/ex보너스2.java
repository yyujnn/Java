package ex0224java;

public class ex보너스2 {

	public static void main(String[] args) {

		
		System.out.println(getMiddle("test"));
		
		
		
	}
	public static String getMiddle(String str) {
		String result = null;
		String[] arr = new String[str.length()];
		
			
		arr=str.split("");
		
	   if(arr.length%2==0) {
		   result= arr[arr.length/2-1]+arr[arr.length/2];
		   
				   
		   
	   }else if(arr.length%2==1) {
		  result=arr[arr.length/2];
	   }
	
		return result;
	}
	
	
	
	

}
