package Assignment_Saturday;

public class Odd_Count_MRT
{

 static long[] oddArray(long[] ar)
 {
	ar[2]=151466;
	return ar;
	 
 }
 public static void main(String[] args) {
	
	 long[] arr= {24564,45678,23456,643547};
	 long[] ar=oddArray(arr);
     long count=0;
		for (int i=0;i<=ar.length-1;i++)
		{
			if(ar[i]%2==1)
			{
			count++;
		
		}
			
	
		}
		System.out.println(count);
 }
}



