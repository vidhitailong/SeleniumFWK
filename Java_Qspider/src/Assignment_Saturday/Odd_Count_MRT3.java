package Assignment_Saturday;

public class Odd_Count_MRT3
{

 int[] oddArray(int[] arr)
 {
	arr[2]=4;
	return arr;
	 
 }
 public static void main(String[] args) {
	
	 int[] arr= {1,3,5,7};
	 int count=0;
	 Odd_Count_MRT3 a= new Odd_Count_MRT3();
	 int[] ar=a.oddArray(arr);
    
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






