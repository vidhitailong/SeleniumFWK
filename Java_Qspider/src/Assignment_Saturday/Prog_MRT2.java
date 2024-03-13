package Assignment_Saturday;

public class Prog_MRT2 {
 
 static char[] arrayFor(char arr[])
 {
	 arr[3]='J';
	return arr;
	 
 }
 static char[] arrayBack(char[] ar)
 {
	ar[2]='K';
	return ar;
	 
 }
 public static void main(String[] args) {
	
	 char[] arr= {'A','B','C','D'};
	 char[] a=arrayFor(arr);

		for (int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		char[] ar= {'A','B','C','D'};
		
		char[] b=arrayBack(ar);
		for (int i=ar.length-1;i>=0;i--)
		{
			System.out.println(b[i]);
		}
}
 
 
}

