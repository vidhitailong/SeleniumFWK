package Collection_Programs;

import java.util.ArrayList;


public class ArrayList_P7 {
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
	
		
		l1.addAll(0,l2);
		
		for(Object o:l1)
		{
		System.out.println(o);
		}
		
		l1.remove(0);
		l1.remove("hello");
		

		for(Object o:l1)
		{
		System.out.println(o);
		}
		
		System.out.println("*************");
		l1.removeAll(l1);
		System.out.println(l1);
		
	
	

}
}

