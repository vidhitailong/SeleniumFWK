package exceptionhandling_throwthrows;

public class Wrong_Pin {
	static void submit() throws WrongPin_Exception
	{
		
			throw new WrongPin_Exception("Wrong Pin");
		
		}
	
	public static void main(String[] args) {
		try
		{
			submit();
		}
		catch(WrongPin_Exception w)
		{
			System.out.println(w.get_msg());
		}
	}

}

class WrongPin_Exception extends Exception
{
	String msg1;

WrongPin_Exception(String msg)
{
	msg1=msg;
}
public String get_msg()
{
	return msg1;
}
}

