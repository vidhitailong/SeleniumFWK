package exceptionhandling_throwthrows;

public class Shadi_App {
	static void submit() throws Shadi_Exception
	{
		int age=15;
		if(age>18)
		{
			System.out.println("Happy Life");
			
		}
		else
		{
			throw new Shadi_Exception("Life Lost");
		
		}
	}
	public static void main(String[] args) {
		try
		{
			submit();
		}
		catch(Shadi_Exception e)
		{
			System.out.println(e.get_msg());
		}
	}

}
