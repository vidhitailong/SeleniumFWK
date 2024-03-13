package Assignment_Saturday;

public class Even_Count_CM4 
{
	public static void main(String[] args) 
	{
		new Even_Count_CM4().arrayEven();
		
		
	}

	 void arrayEven() 
	{
		int count=0;
		byte[] a = {24,44,55,33,77,64,59};
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



