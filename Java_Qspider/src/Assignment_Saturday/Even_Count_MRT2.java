package Assignment_Saturday;

public class Even_Count_MRT2
{

  double[] evenArray(double[] ar)
 {
	ar[2]=145.64;
	return ar;
	 
 }
 public static void main(String[] args) {
	
	 double[] arr= {241.34,446.78,251.234,4777.77};
	 double[] ab=new Even_Count_MRT2().evenArray(arr);
	
	 int count=0;
		for (int i=0;i<=ab.length-1;i++)
		{
			if(ab[i]%2==0)
			{
			count++;
			System.out.println(ab[i]);
		}
			
	
		}
		System.out.println(count);
 }
}





