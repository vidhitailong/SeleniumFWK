package Assignment_Saturday;

public class Odd_Count_MRT2
{

 static byte[] oddArray(byte[] ar)
 {
	ar[2]=1;
	return ar;
	 
 }
 public static void main(String[] args) {
	
	 byte[] arr= {2,3,5,6};
	 int count=0;
	 byte[] ar=oddArray(arr);
    
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





