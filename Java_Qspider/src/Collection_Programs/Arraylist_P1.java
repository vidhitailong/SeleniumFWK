package Collection_Programs;

import java.util.ArrayList;

public class Arraylist_P1 {

	public static void main(String[] args) {
		
		ArrayList l= new ArrayList();
		
		l.add(1);
		l.add("hello");
		l.add('A');
		l.add(true);
		
			System.out.println(l);	
	
		
		
		l.add(3,"Hi");
		System.out.println("*************");
		System.out.println(l);
	}
}
