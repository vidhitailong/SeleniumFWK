package logical_programs;

public class Factorial_P1 {
	
	public static void main(String[] args) {
		int no=5;
		int fact=1;
		for(int i=no;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
