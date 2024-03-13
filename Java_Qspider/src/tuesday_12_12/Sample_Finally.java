package tuesday_12_12;

public class Sample_Finally {
	public static void main(String[] args) {
		System.out.println("Main Starts");
	
	try
	{
		int a=1/0;
	}
	catch(ArithmeticException a)
	{
		System.out.println("Handled");
	}
finally
{
	System.out.println("I am Finally Block");
}
	System.out.println("Main Ends");
	}
}