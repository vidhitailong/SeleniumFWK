package abstract_Program;

interface Mobile
{
public abstract void Calling();
public abstract void Camera();
public abstract void Storage();
public abstract void BatteryLife();


}
abstract class TesttFri implements Mobile
{

	public void Calling()	
	{
	System.out.println("Calling option is Available");
	}
	public void Camera()	
	{
	System.out.println("Camera is Available");
	}
	
}
abstract class TestFri1 extends TesttFri
{
	public void Storage()	
	{
	System.out.println("Storage is Available");
	}
}
class TestFri2 extends TestFri1
{
	public void BatteryLife()	
	{
	System.out.println("BatteryLife is good");
	}
}
class Inter_Main1
{
	public static void main(String[] args) 
	{
		TestFri2 a= new TestFri2();
		a.BatteryLife();
		a.Calling();
		a.Camera();
		a.Storage();
	}
}
