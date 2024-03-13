package Assignment_Saturday;

public class Prog_CM4 {
 public static void main(String[] args) {
	arrayFor();
	arrayBack();
}
 static void arrayFor()
 {
	int[] arr= {2,5,6,3};
	for (int i=0;i<=arr.length-1;i++)
	{
		System.out.println(arr[i]);
	}
	 
 }
 static void arrayBack()
 {
	 int[] ar= {4,7,6,8};
	for (int i=ar.length-1;i>=0;i--)
	{
		System.out.println(ar[i]);
	}
	 
 }
}
