package Assignment_Saturday;

public class Prog_MR {
 
 static int[] arrayFor(int arr[])
 {
	 arr[3]=45;
	return arr;
	 
 }
 static int[] arrayBack(int[] ar)
 {
	ar[2]=19;
	return ar;
	 
 }
 public static void main(String[] args) {
	
	 int[] arr= {23,54,52,34};
	 int[] a=arrayFor(arr);

		for (int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		
		int[] ar= {23,54,52,34};
		
		 int[] b=arrayBack(ar);
		for (int i=ar.length-1;i>=0;i--)
		{
			System.out.println(b[i]);
		}
}
 
 
}

