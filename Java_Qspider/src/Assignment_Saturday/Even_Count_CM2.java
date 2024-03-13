package Assignment_Saturday;

public class Even_Count_CM2
{
	public static void main(String[] args) 
	{
		arrayEven();
		
	}

	static void arrayEven() 
	{
		int count=0;
		float[] a = {25.6f,4.35f,55.6f,34.6f,3.47f,69.7f,52.4f};
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




