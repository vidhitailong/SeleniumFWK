package Assignment_Saturday;

public class Prog_Even_MRT1{
 
 static short[] arrayBack(short[] ar)
 {
	ar[2]=345;
	return ar;
	 
 }
 public static void main(String[] args) 
 {
	 short[] ar= {246,455,233,648};
		
	 short[] b=arrayBack(ar);
		
		for (int i=ar.length-1;i>=0;i--)
		{
			if(b[i]%2==0)
			{
			System.out.println(b[i]);
		}
}
 
 
}
}

