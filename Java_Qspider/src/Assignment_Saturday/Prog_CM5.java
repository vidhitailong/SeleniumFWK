package Assignment_Saturday;

public class Prog_CM5 {
 public static void main(String[] args) {
	arrayFor();
	arrayBack();
}
 static void arrayFor()
 {
	byte[] arr= {1,4,7,9};
	for (int i=0;i<=arr.length-1;i++)
	{
		System.out.println(arr[i]);
	}
	 
 }
 static void arrayBack()
 {
	 byte[] ar= {4,7,6,3};
	for (int i=ar.length-1;i>=0;i--)
	{
		System.out.println(ar[i]);
	}
	 
 }
}

