package abstract_Program;

interface Flipkart
{
public abstract void Fashion();
public abstract void Electronics();
public abstract void PaymentOptions();


}
class Testt implements Flipkart
{

	public void Fashion()	
	{
	System.out.println("Fashion Category is Available");
	}
	public void Electronics()	
	{
	System.out.println("Electronics Category is Available");
	}
	public void PaymentOptions()	
	{
	System.out.println("Different Payment options are available");
	}

}
class Inter_Main
{
	public static void main(String[] args) 
	{
		Testt a= new Testt();
		a.Electronics();
        a.PaymentOptions();
        a.Fashion();
	}
}
