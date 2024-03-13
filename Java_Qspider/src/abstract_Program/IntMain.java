package abstract_Program;

interface Sample1
{
public abstract void fo();
public abstract void cool();

}
class Demo2 implements Sample1
{

	public void fo()	
	{
	System.out.println("Hi");
	}
	public void cool()	
	{
	System.out.println("Hello");
	}

}
class IntMain
{
	public static void main(String[] args) 
	{
		Demo2 d= new Demo2();
		d.fo();
		d.cool();
	}
}