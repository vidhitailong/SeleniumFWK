package Assignment_Saturday;

public class Even_Count_MRT1
{

  long[] evenArray(long[] ar)
 {
	ar[2]=14564;
	return ar;
	 
 }
 public static void main(String[] args) {
	
	 long[] arr= {24134,446787,251234,477777};
	 Even_Count_MRT1 a=new Even_Count_MRT1();
	 long[] ar=a.evenArray(arr);
	 int count=0;
		for (int i=0;i<=ar.length-1;i++)
		{
			if(ar[i]%2==0)
			{
			count++;
		
		}
			
	
		}
		System.out.println(count);
 }
}




