package Assignment_Saturday;

public class Even_Count_CM3
{
	public static void main(String[] args) 
	{
		arrayEven();
		
	}

	static void arrayEven() 
	{
		int count=0;
		double[] a = {25.6,4.35,55.6,34.6,3.47,69.7,52.4};
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





