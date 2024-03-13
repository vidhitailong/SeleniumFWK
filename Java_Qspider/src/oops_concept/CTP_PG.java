package oops_concept;

public class CTP_PG {
	
	static void send(int no)
	{
		System.out.println(no);
	}
	static void send(String msg)
	{
		System.out.println(msg);
	}
	
	
	public static void main(String[] args) {
		
		send(123);
		send("Hi");
		
	}

}
