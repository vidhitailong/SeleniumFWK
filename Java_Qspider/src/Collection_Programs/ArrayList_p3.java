package Collection_Programs;

import java.util.ArrayList;


public class ArrayList_p3 {
	
	public static void main(String[] args) {
		
		ArrayList l1= new ArrayList();
		
		l1.add(1);
		l1.add("hello");
		l1.add('A');
		l1.add(true);
		
		l1.remove(0);
		l1.remove("hello");
		

		System.out.println(l1);
		System.out.println("*************");
		l1.removeAll(l1);
		System.out.println(l1);
		
	
	

}
}