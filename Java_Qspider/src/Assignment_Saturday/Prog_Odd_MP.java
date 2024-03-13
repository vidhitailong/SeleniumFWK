package Assignment_Saturday;


public class Prog_Odd_MP {
 
 static void arrayFor(int arr[])
 {
	 for (int i=0;i<=arr.length-1;i++)
		{
			if (arr[i] % 2 == 1) {
				
				System.out.println(arr[i]);
			}
			
		}
	
	 
 }
 
 public static void main(String[] args) {
	
	 int[] arr= {23,54,52,34};
	 arrayFor(arr);

		
		
		
}
 
 
}



