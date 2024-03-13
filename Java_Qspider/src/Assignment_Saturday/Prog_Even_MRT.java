package Assignment_Saturday;

public class Prog_Even_MRT{
 
 static byte[] arrayBack(byte[] ar)
 {
	ar[2]=17;
	return ar;
	 
 }
 public static void main(String[] args) 
 {
	 byte[] ar= {24,45,23,64};
		
	 byte[] b=arrayBack(ar);
		
		for (int i=ar.length-1;i>=0;i--)
		{
			if(b[i]%2==0)
			{
			System.out.println(b[i]);
		}
}
 
 
}
}
