package Collection_Programs;

import java.util.ArrayList;

public class Arraylist_P6 {

	public static void main(String[] args) {
		
		ArrayList l= new ArrayList();
		
		l.add(1);
		l.add("hello");
		l.add('A');
		l.add(true);
		
		for(Object o:l)
		{
		
			System.out.println(o);	
		}
		
		
	}
}
