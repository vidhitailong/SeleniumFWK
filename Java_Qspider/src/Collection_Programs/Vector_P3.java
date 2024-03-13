package Collection_Programs;

import java.util.Vector;



public class Vector_P3 {
	public static void main(String[] args) {
		
		Vector v= new Vector();
		v.add(1);
		v.add("hello");
		v.add('A');
		v.add(true);
		
		Vector v2= new Vector();
		v2.add(1);
		v2.add("Good Morning");
		v2.add('v');
		v2.add(true);
		
		System.out.println(v); 
		System.out.println(v2);
	
	
		 v2.remove(true); 
		 v.remove("hello"); 
		 System.out.println("*************"); 
		 System.out.println(v2);
		 System.out.println("*************"); 
			System.out.println(v.size());
			System.out.println("*************"); 
			System.out.println(v2.size());
			System.out.println("*************");
			System.out.println(v.contains('A'));
			System.out.println("*************");
			System.out.println(v2.contains('v'));
			 System.out.println("*************"); 
			 v.removeAll(v); 
			 v2.removeAll(v2);
			 System.out.println(v);
			 System.out.println(v2);
			 
}

}


