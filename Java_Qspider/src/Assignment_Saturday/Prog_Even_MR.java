package Assignment_Saturday;

public class Prog_Even_MR{
 
 static long[] arrayBack(long[] ar)
 {
	ar[2]=151466;
	return ar;
	 
 }
 public static void main(String[] args) {
	
		long[] ar= {24564,45674,23456,643547};
		
		long[] b=arrayBack(ar);
		
		for (int i=ar.length-1;i>=0;i--)
		{
			if(b[i]%2==0)
			{
			System.out.println(b[i]);
		}
}
 
 
}
}


