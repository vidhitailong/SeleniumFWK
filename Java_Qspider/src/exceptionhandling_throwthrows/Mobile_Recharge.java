package exceptionhandling_throwthrows;

public class Mobile_Recharge {
static void submit()throws Recharge_Exception
{
	int money=0;
	if(money>100)
	{
		System.out.println("Recharge Done");
	}
	else 
	{
		throw new Recharge_Exception("Recharge Pending");
	}
}
public static void main(String[] args) {
	 try
	 {
	submit();	 
	 }
	catch(Recharge_Exception e) 
	 {
		System.out.println(e.get_msg());
	 }
}
}
