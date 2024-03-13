package logical_programs;

public class Strong_Number {
	
	public static int fact(int value) {
		int no= value;
		int fact=1;
		for(int i=no; i >=1;i--)
		{
			fact=fact*i;
			
		}
		return fact;
	}
	
	public static void main(String[] args) {
		
		for(int i=0; i<=1000000; i++)
		{
		int no=i;
		int copy=no;
		int sum=0;
		while(no!=0)
		{
			int rem= no%10;
			sum=sum+fact(rem);
			no=no/10;
		}
		
	if(copy==sum)
			System.out.println(i +" Strong");
		/*else 
			System.out.println("Not Strong");
		}*/
		
	}

	}
}
