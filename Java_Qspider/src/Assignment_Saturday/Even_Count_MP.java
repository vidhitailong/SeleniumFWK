package Assignment_Saturday;

public class Even_Count_MP
{
	public static void main(String[] args) 
	{
		int[] a = {2,4,4,3,7,6,5};
		arrayEven(a);
		
	}

	static void arrayEven(int[] a) 
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



