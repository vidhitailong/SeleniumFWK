package Assignment_Saturday;

public class Prog_Even_CM {
	public static void main(String[] args) 
	{
		arrayEven();
		
	}

	static void arrayEven() 
	{
		int[] a = {2,4,5,3,7,6,5};
		
		
		for (int i = a.length-1; i >=0; i--) 
		{
			
			
			if (a[i] % 2 == 0)
			{
		
				System.out.println(a[i]);
			}
			
		}
		
		
	}

}

