package Assignment_Saturday;

public class Even_Count_MRT
{

  int[] evenArray(int[] ar)
 {
	ar[2]=14;
	return ar;
	 
 }
 public static void main(String[] args) {
	
	 int[] arr= {24,48,25,47};
	 Even_Count_MRT a=new Even_Count_MRT();
	 int[] ar=a.evenArray(arr);
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



