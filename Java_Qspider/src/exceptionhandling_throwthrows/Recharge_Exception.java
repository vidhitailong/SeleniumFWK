package exceptionhandling_throwthrows;

public class Recharge_Exception extends Exception
{
String msg1;

Recharge_Exception(String msg)
{
	msg1=msg;
}
public String get_msg()
{
	return msg1;
}

}

