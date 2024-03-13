package Assignment_Saturday;

public class Odd_Count_CM {
	public static void main(String[] args) 
	{
		arrayOdd();
		
	}

	static void arrayOdd() 
	{
		int count=0;
		int[] a = {2,4,5,3,7,6,5};
	    for (int i = 0; i <= a.length-1; i++) 
		{
			
			if (a[i] % 2 == 1) 
			{
		      count++;
			
			System.out.println(a[i]);
		      
			}
			
		}
	    System.out.println(count);
		
	
	
	}
}


