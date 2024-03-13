package Assignment_Saturday;

public class Prog_MRT5 {
 
 static short[] arrayFor(short arr[])
 {
	 arr[3]=44;
	return arr;
	 
 }
 static byte[] arrayBack(byte[] ar)
 {
	ar[2]=1;
	return ar;
	 
 }
 public static void main(String[] args) {
	
	 short[] arr= {23,54,52,34};
	 short[] a=arrayFor(arr);

		for (int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		
		byte[] ar= {2,5,6,3};
		
		byte[] b=arrayBack(ar);
		for (int i=ar.length-1;i>=0;i--)
		{
			System.out.println(b[i]);
		}
}
 
 
}



