package Assignment_Saturday;

public class Prog_Even_MP{
 
 static void arrayBack(long[] ar)
 {
	
	 for (int i=ar.length-1;i>=0;i--)
		{
			if(ar[i]%2==0)
			{
			System.out.println(ar[i]);
		}
}
	 
 }
 public static void main(String[] args) {
	
		long[] ar= {24564,45674,23456,643547};
		
		arrayBack(ar);
		
		
 
 
}
}



