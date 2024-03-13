package exceptionhandling_throwthrows;

public class Shadi_Exception extends Exception
{
	String msg1;
	Shadi_Exception(String msg)
	{
		msg1=msg;
	}
	public String get_msg()
	{
		return msg1;
	}

}
