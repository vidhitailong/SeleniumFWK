package Assignment_Saturday;

public class Prog_Odd_CM1 {
	public static void main(String[] args) 
	{
		arrayOdd();
		
	}

	static void arrayOdd() 
	{
		double[] a = {2.0,4.5,5.6,3.7,7.3,6.2,5.9};
		
		for (int i = 0; i <= a.length-1; i++) 
		{
			if (a[i] % 2 == 1) 
			{
		
				System.out.println(a[i]);
			}
		}
		
	}

}


