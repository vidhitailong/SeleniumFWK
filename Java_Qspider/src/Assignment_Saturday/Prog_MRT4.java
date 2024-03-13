package Assignment_Saturday;

public class Prog_MRT4 {
 
 static float[] arrayFor(float arr[])
 {
	 arr[3]=4.5f;
	return arr;
	 
 }
 static float[] arrayBack(float[] ar)
 {
	ar[2]=1.9f;
	return ar;
	 
 }
 public static void main(String[] args) {
	
	 float[] arr= {2.3f,5.4f,5.2f,3.4f};
	 float[] a=arrayFor(arr);

		for (int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		
		float[] ar= {2.3f,5.4f,5.2f,3.4f};
		
		float[] b=arrayBack(ar);
		for (int i=ar.length-1;i>=0;i--)
		{
			System.out.println(b[i]);
		}
}
 
 
}


