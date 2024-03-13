package abstract_Program;

interface SampleIn
{
public abstract void cool();

}
class Demo3 implements SampleIn
{

	public void cool()	
	{
	System.out.println("Hi");
	}
	public void disp()	
	{
	System.out.println("hello");
	}
	
}
 class Tester3 implements SampleIn
{
	 public void cool()	
		{
		System.out.println("Hii");
		}
	public void foo()	
	{
	System.out.println("Good Morning");
	}
}
class Mini implements SampleIn
{
	public void cool()	
	{
	System.out.println("Hiii");
	}
	public void hot()	
	{
	System.out.println("Good Afternoon");
	}
}
class Herira
{
	public static void main(String[] args) 
	{
		Demo3 d= new Demo3();
		d.cool();
		d.disp();
		Tester3 t= new Tester3();
		t.cool();
	    t.foo();
	    Mini m= new Mini();
	    m.cool();
	    m.hot();
	}
}

