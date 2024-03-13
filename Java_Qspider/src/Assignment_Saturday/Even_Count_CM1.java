package Assignment_Saturday;

public class Even_Count_CM1
{
	public static void main(String[] args) 
	{
		arrayEven();
		
	}

	static void arrayEven() 
	{
		int count=0;
		long[] a = {256,435,556,346,347,697,524};
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



