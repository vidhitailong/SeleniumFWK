package Assignment_Saturday;

public class Prog_MRT {
 
 static String[] arrayFor(String arr[])
 {
	 arr[3]="AC";
	return arr;
	 
 }
 static String[] arrayBack(String[] ar)
 {
	ar[2]="FG";
	return ar;
	 
 }
 public static void main(String[] args) {
	
	 String[] arr= {"AB","BC","CD","DE"};
	 String[] a=arrayFor(arr);

		for (int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		
		String[] ar= {"AB","BC","CD","DE"};
		
		String[] b=arrayBack(ar);
		for (int i=ar.length-1;i>=0;i--)
		{
			System.out.println(b[i]);
		}
}
 
 
}

