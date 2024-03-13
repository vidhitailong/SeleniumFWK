package logical_programs;

public class Prog1 {
	public static void main(String[] args) {
		
		int no=5674;
		while(no!=0)
		{
			int rem=no%10;
			System.out.println(rem);
			no=no/10;
		}
	}

}
