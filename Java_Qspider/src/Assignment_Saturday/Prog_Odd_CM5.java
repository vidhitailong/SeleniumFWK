package Assignment_Saturday;

public class Prog_Odd_CM5 {
	public static void main(String[] args) 
	{
		arrayOdd();
		
	}

	static void arrayOdd() 
	{
		byte[] a = {2,5,7,3,6,66,35};
		
		for (int i = 0; i <= a.length-1; i++) 
		{
			if (a[i] % 2 == 1) {
		
				System.out.println(a[i]);
			}
		}
		
	}

}



