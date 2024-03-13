package abstract_Program;

abstract class Month
{
	abstract void datee();
	abstract void day();
}

abstract class TodaysDate extends Month
{
	void datee()
	{
		System.out.println("Todays Datee is 01-12-23");
	}
}

class TodaysDay extends TodaysDate
{
	void day()
	{
		System.out.println("Todays Day is Friday");
	}
}

public class Main_Abstract {

	public static void main(String[] args) {
		TodaysDay t= new TodaysDay();
		t.datee();
		t.day();
	}
}
