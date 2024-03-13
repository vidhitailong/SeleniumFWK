package Assignment_Saturday;

public class Prog_MRT3 {
 
 static long[] arrayFor(long arr[])
 {
	 arr[3]=835683;
	return arr;
	 
 }
 static long[] arrayBack(long[] ar)
 {
	ar[2]=151466;
	return ar;
	 
 }
 public static void main(String[] args) {
	
	 long[] arr= {24564,45678,23456,643547};
	 long[] a=arrayFor(arr);

		for (int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		
		long[] ar= {24564,45678,23456,643547};;
		
		long[] b=arrayBack(ar);
		for (int i=ar.length-1;i>=0;i--)
		{
			System.out.println(b[i]);
		}
}
 
 
}


