package Assignment_Saturday;

public class Prog_MRT1 {
 
 static double[] arrayFor(double arr[])
 {
	 arr[3]=4.5;
	return arr;
	 
 }
 static double[] arrayBack(double[] ar)
 {
	ar[2]=1.9;
	return ar;
	 
 }
 public static void main(String[] args) {
	
	 double[] arr= {2.3,5.4,5.2,3.4};
	 double[] a=arrayFor(arr);

		for (int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		
		double[] ar= {2.3,5.4,5.2,3.4};
		
		double[] b=arrayBack(ar);
		for (int i=ar.length-1;i>=0;i--)
		{
			System.out.println(b[i]);
		}
}
 
 
}

