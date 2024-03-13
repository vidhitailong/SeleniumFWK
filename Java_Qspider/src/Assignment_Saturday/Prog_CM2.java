package Assignment_Saturday;

public class Prog_CM2 {
 public static void main(String[] args) {
	arrayFor();
	arrayBack();
}
 static void arrayFor()
 {
	double[] arr= {0.1,0.2,0.3,0.4,0.5};
	for (int i=0;i<=arr.length-1;i++)
	{
		System.out.println(arr[i]);
	}
	 
 }
 static void arrayBack()
 {
	 double[] ar= {0.1,0.2,0.3,0.4,0.5};
	for (int i=ar.length-1;i>=0;i--)
	{
		System.out.println(ar[i]);
	}
	 
 }
}
