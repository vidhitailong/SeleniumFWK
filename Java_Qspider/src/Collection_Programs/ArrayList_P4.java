package Collection_Programs;

import java.util.ArrayList;


public class ArrayList_P4 {
	
	public static void main(String[] args) {
		
		ArrayList l1= new ArrayList();
		
		l1.add(1);
		l1.add("hello");
		l1.add('A');
		
		ArrayList l2= new ArrayList();
		l2.add(1);
		l2.add("hello");
		l2.add('B');
		
		l1.retainAll(l2);
		
		System.out.println(l1);
		
	
	

}
}
