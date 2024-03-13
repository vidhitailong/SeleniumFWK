package oops_concept;

class Customer {
	
	private int Atm_pin=3456;
	public int get_Atm_Pin()
	{
		return Atm_pin;
	}
}
public class Encapulation
{

	public static void main(String[] args)
	{
		Customer i= new Customer();
		System.out.println(i.get_Atm_Pin());
		
	}
	

}
