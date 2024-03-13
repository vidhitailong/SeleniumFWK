package abstract_Program;

abstract class Sample
{
abstract void fo();
abstract void disp();
}

abstract class Test1 extends Sample
{
void fo()
{
System.out.println("Hello");
}

}
class Test2 extends Test1
{
	void disp()
	{
	System.out.println("Hi");
	}
	}
	


public class MainClass1
{
public static void main(String[] args)
{
	Test2 t=new Test2();
	t.fo();
	t.disp();
}
}
