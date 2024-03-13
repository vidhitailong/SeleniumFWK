package logical_programs;

public class Prog5 {
public static void main(String[] args) {
		
		int no=5674;
		
		while(no!=0)
		{
			int rem=no%10;
			//System.out.println(rem*rem);
			System.out.println(rem*rem*rem);
			
			no=no/10;
		}
		
	}

}
