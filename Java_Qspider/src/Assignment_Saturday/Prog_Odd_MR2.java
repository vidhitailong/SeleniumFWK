package Assignment_Saturday;

public class Prog_Odd_MR2 {
 
 static long[] arrayFor(long arr[])
 {
	 arr[3]=467545;
	return arr;
	 
 }
 
 public static void main(String[] args) {
	
	 long[] arr= {23657,58754,512342,387643};
	 long[] a=arrayFor(arr);

		for (int i=0;i<=a.length-1;i++)
		{
			if (a[i] % 2 == 1) {
				
				System.out.println(a[i]);
			}
			
		}
		
		
}
 
 
}



