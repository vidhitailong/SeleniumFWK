package logical_programs;

public class Prog6 {
public static void main(String[] args) {
		
		int no=5674;
		int copy=no;
		int sum=0;
		while(no!=0)
		{
			int rem=no%10;
			sum=sum+(rem*rem*rem);
			no=no/10;
		}
			if(copy==sum)
				System.out.println("Is an ArmStrong Number");
			else
				
				System.out.println("Is not an ArmStrong Number");
		}
		
	}


