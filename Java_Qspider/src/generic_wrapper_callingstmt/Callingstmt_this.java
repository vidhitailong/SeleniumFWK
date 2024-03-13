package generic_wrapper_callingstmt;

public class Callingstmt_this {

	Callingstmt_this(String s)
	{
		System.out.println(s);
	}
	Callingstmt_this(int no)
	{
		System.out.println(no);
	}
	Callingstmt_this()
	{
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		Callingstmt_this c= new Callingstmt_this();
	}
}
