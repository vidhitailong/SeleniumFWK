package Assignment_Saturday;

public class Prog_MP {
 
  void arrayFor(int arr[])
 {
	
	for (int i=0;i<=arr.length-1;i++)
	{
		System.out.println(arr[i]);
	}
	 
 }
  void arrayBack(int[] ar)
 {
	
	for (int i=ar.length-1;i>=0;i--)
	{
		System.out.println(ar[i]);
	}
	 
 }
 public static void main(String[] args) {
	 Prog_MP a= new Prog_MP();
	 int arr[]= {23,54,52,34};
	 a.arrayFor(arr);
	 int ar[]= {23,54,52,34};
		a.arrayBack(ar);
	
}
}
