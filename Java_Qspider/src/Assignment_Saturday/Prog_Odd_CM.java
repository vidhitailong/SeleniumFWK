package Assignment_Saturday;

public class Prog_Odd_CM {
	public static void main(String[] args) 
	{
		arrayOdd();
		
	}

	static void arrayOdd() 
	{
		int[] a = {2,4,5,3,7,6,5};
		
		for (int i = 0; i <= a.length-1; i++) 
		{
			if (a[i] % 2 == 1) {
		
				System.out.println(a[i]);
			}
		}
		
	}

}

