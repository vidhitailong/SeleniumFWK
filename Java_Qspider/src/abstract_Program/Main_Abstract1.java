package abstract_Program;

abstract class Year
{
	abstract void Month();
	abstract void WhichYear();
}

abstract class ThisMonth extends Year
{
	void Month()
	{
		System.out.println("This month is December");
	}
}

class ThisYear extends ThisMonth
{
	void WhichYear()
	{
		System.out.println("This year is 2023");
	}
}

public class Main_Abstract1 {

	public static void main(String[] args) {
		ThisYear t= new ThisYear();
		t.WhichYear();
		t.Month();
	}
}
