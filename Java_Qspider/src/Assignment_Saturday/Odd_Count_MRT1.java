package Assignment_Saturday;

public class Odd_Count_MRT1
{

 static double[] oddArray(double[] ar)
 {
	ar[2]=1.55;
	return ar;
	 
 }
 public static void main(String[] args) {
	
	 double[] arr= {24.4,45.8,23.5,64.7};
	 int count=0;
	 double[] ar=oddArray(arr);
    
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




