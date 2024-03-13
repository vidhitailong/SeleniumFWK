package oops_concept;

 class Tuesday2
{
	
	void send1()
	{
		System.out.println("Some Msg");
	}

}
class RTP_PG1 extends Tuesday2
{
	
	void send1()
	{
		System.out.println("Some Msg1");
	}
}
class RTP_PG2 extends Tuesday2
{

	void send1()
	{
		System.out.println("Some Msg3");
	}

}
 class Tuesday1 
{
	static void tues(Tuesday2 a)
	{
		a.send1();
	}
	
}
class RTP_PG
{
	public static void main(String[] args)
	{
		RTP_PG1 b= new RTP_PG1();
		
		RTP_PG2 c= new RTP_PG2();
		Tuesday1.tues(b);
		Tuesday1.tues(c);
		
		
		
		
	}
}