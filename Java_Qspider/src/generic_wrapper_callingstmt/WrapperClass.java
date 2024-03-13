package generic_wrapper_callingstmt;


public class WrapperClass {
	
	public static void main(String[] args) {
		//Integer a= new Integer(10);
		Integer a= Integer.valueOf(10);
		System.out.println(a);
		
		int b=a;
		System.out.println(b);
		
	}

}
