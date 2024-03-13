package exceptionhandling_throwthrows;

public class Laptop_Virus {
	static void submit() throws Virus_Exception
	{
		
			throw new Virus_Exception("Laptop at risk");
		
		}
	
	public static void main(String[] args) {
		try
		{
			submit();
		}
		catch(Virus_Exception v)
		{
			System.out.println(v.get_msg());
		}
	}

}

class Virus_Exception extends Exception
{
	String msg1;

	Virus_Exception(String msg)
{
	msg1=msg;
}
public String get_msg()
{
	return msg1;
}
}


