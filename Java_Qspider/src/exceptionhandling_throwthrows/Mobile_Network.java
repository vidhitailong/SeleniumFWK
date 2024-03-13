package exceptionhandling_throwthrows;

public class Mobile_Network {
	static void submit() throws Network_Exception
	{
		
			throw new Network_Exception("Out of Coverage");
		
		}
	
	public static void main(String[] args) {
		try
		{
			submit();
		}
		catch(Network_Exception m)
		{
			System.out.println(m.get_msg());
		}
	}

}

class Network_Exception extends Exception
{
	String msg1;

	Network_Exception(String msg)
{
	msg1=msg;
}
public String get_msg()
{
	return msg1;
}
}


