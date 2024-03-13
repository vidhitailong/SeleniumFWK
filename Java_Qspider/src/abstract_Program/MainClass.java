package abstract_Program;

abstract class Demo
{
abstract void fo();
abstract void cool();
}

class Test extends Demo
{
void fo()
{
System.out.println("Hello");
}

void cool()
{
System.out.println("Hi");
}
}


public class MainClass 
{
public static void main(String[] args)
{
	Test t=new Test();
	t.fo();
	t.cool();
}
}
