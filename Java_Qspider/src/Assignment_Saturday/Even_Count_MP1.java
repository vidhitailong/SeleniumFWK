package Assignment_Saturday;

public class Even_Count_MP1
{
	public static void main(String[] args) 
	{
		long[] a = {245,466,4422,3546,74567,6532,53267};
		arrayEven(a);
		
	}

	static void arrayEven(long[] a) 
	{
		int count=0;
		
	    for (int i = 0; i <= a.length-1; i++) 
		{
			
			if (a[i] % 2 == 0) 
			{
		      count++;
		      
			}
			
		}
	    System.out.println(count);
		
	
}
}



