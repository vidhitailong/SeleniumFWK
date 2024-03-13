package Assignment_Saturday;


public class Prog_Odd_MR1 
{
 
 static double[] arrayFor(double arr[])
 {
	 arr[3]=0.5;
	return arr;
	 
 }
 
 public static void main(String[] args) {
	
	 double[] arr= {0.2,0.3,0.5,0.7,0.6};
	 double[] a=arrayFor(arr);

		for (int i=0;i<=a.length-1;i++)
		{
			if (a[i] % 2 == 1) 
			{
				
				System.out.println(a[i]);
			}
			
		}
		
		
}
 
 
}



