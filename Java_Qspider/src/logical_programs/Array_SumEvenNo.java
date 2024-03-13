package logical_programs;

public class Array_SumEvenNo {
	
	public static void main(String[] args) {
		int arr[]= {10,23,34,45,46};
		
		int sum=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i] %2==0)
			{
			sum=sum+arr[i];
			}
		}
		System.out.println(sum);
	}

}
