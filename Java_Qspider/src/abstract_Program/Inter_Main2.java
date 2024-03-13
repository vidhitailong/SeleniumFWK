package abstract_Program;

interface BankApp
{
public abstract void SecurityLogin();
public abstract void TransferMoney();
public abstract void CheckBalance();
public abstract void Investments();


}
abstract class TesttFriday implements BankApp
{

	public void SecurityLogin()	
	{
	System.out.println("SecurityLogin is Available");
	}
	public void TransferMoney()	
	{
	System.out.println("TransferMoney is Available");
	}
	
}
abstract class TesttFriday1 extends TesttFriday
{
	public void CheckBalance()	
	{
	System.out.println("CheckBalance option is Available");
	}
}
class TesttFriday2 extends TesttFriday1
{
	public void Investments()	
	{
	System.out.println("Investments option is Available");
	}
}
class Inter_Main2
{
	public static void main(String[] args) 
	{
		TesttFriday2 a= new TesttFriday2();
		a.CheckBalance();
		a.SecurityLogin();
		a.Investments();
		a.TransferMoney();
	}
}

