package abstract_Program;

interface Audi
{
	void engine();
	void wheel();
	void str();
	void color();
}
abstract class Car implements Audi
{
	public void engine()
	{
		System.out.println("2000cc Engine");
		
	}
}
abstract class Car1 extends Car
{
	public void wheel()
	{
		System.out.println("Alloy Wheel");
		
	}
	public void str()
	{
		System.out.println("Power Str");
		
	}
	
}
class Car2 extends Car1
{
	public void color()
	{
		System.out.println("Black");
				
	}
}



public class IntMain1 
{
public static void main(String[] args) 
{
	Car2 c= new Car2();
	c.engine();
	c.color();
	c.str();
	c.wheel();
}
}
