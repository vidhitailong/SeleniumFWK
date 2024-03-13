package Assignment_Saturday;

public class Prog_CM {
 public static void main(String[] args) {
	arrayFor();
	arrayBack();
}
 static void arrayFor()
 {
	String[] arr= {"Hi","Hii","Hii","Hiii"};
	for (int i=0;i<=arr.length-1;i++)
	{
		System.out.println(arr[i]);
	}
	 
 }
 static void arrayBack()
 {
	String[] ar= {"H","Hi","Hii","Hiii"};
	for (int i=ar.length-1;i>=0;i--)
	{
		System.out.println(ar[i]);
	}
	 
 }
}
