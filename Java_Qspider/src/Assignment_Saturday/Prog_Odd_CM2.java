package Assignment_Saturday;

public class Prog_Odd_CM2 {
	public static void main(String[] args) 
	{
		arrayOdd();
		
	}

	static void arrayOdd() 
	{
		long[] a = {26266,455526,5675472,6362573,26768337,36232666,373857775};
		
		for (int i = 0; i <= a.length-1; i++) 
		{
			if (a[i] % 2 == 1) {
		
				System.out.println(a[i]);
			}
		}
		
	}

}


