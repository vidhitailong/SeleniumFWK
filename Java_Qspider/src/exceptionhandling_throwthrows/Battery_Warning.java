package exceptionhandling_throwthrows;

public class Battery_Warning {
	static void submit() throws LowBattery_Exception
	{
		int battery=15;
		if(battery>16) {
			System.out.println("Battery Remaining");
		}
			throw new LowBattery_Exception("Charging Required");
		
		}
	
	public static void main(String[] args) {
		try
		{
			submit();
		}
		catch(LowBattery_Exception l)
		{
			System.out.println(l.get_msg());
		}
	}

}

class LowBattery_Exception extends Exception
{
	String msg1;

	LowBattery_Exception(String msg)
{
	msg1=msg;
}
public String get_msg()
{
	return msg1;
}
}

