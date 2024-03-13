package Collection_Programs;

import java.util.ArrayList;


public class ArrayList_P2 {
	public static void main(String[] args) {
		
		ArrayList l1= new ArrayList();
		
		l1.add(1);
		l1.add("hello");
		l1.add('A');
		l1.add(true);
		
		ArrayList l2= new ArrayList();
		l2.add(2);
		l2.add("heeello");
		l2.add('B');
	
		System.out.println(l1);
		System.out.println("*************");
		System.out.println(l2);
		l1.addAll(0,l2);
		System.out.println("*************");
		System.out.println(l1);
		
	
	

}
}
