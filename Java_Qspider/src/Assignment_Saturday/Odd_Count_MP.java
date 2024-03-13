package Assignment_Saturday;

public class Odd_Count_MP {
	public static void main(String[] args) 
	{
		int[] a = {2,4,5,3,7,6,5};
		arrayOdd(a);
		
	}

	static void arrayOdd(int[] a) 
	{
		int count=0;
		
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


