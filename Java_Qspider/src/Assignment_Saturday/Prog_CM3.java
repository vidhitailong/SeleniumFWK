package Assignment_Saturday;

public class Prog_CM3 {
 public static void main(String[] args) {
	arrayFor();
	arrayBack();
}
 static void arrayFor()
 {
	long[] arr= {23456,5456786,525246,34343};
	for (int i=0;i<=arr.length-1;i++)
	{
		System.out.println(arr[i]);
	}
	 
 }
 static void arrayBack()
 {
	long[] ar= {576754,277227,266566,2672222};
	for (int i=ar.length-1;i>=0;i--)
	{
		System.out.println(ar[i]);
	}
	 
 }
}
