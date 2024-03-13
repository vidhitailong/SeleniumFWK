package Assignment_Saturday;

public class Even_Count_CM 
{
	public static void main(String[] args) 
	{
		Even_Count_CM a= new Even_Count_CM();
		a.arrayEven();
		
	}

	 void arrayEven() 
	{
		int count=0;
		int[] a = {2,4,5,3,7,6,5};
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


