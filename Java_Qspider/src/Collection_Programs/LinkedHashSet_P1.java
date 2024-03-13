package Collection_Programs;

import java.util.LinkedHashSet;



public class LinkedHashSet_P1 {
	public static void main(String[] args) {
		
		LinkedHashSet lh= new  LinkedHashSet();
		lh.add(5843);
		lh.add("Hello LinkedHashSet");
		lh.add('O');
		lh.add(true);
		
		LinkedHashSet lh2= new  LinkedHashSet();
		lh2.add(19864);
		lh2.add("Hello Java");
		lh2.add('M');
		lh2.add(false);
		
		for(Object o:lh)
		System.out.println(o); 
		 System.out.println("*************"); 

		for(Object o2:lh2)
		System.out.println(o2);
		 System.out.println("*************"); 
	
	
		 lh2.remove(false); 
		 lh.remove("Hello LinkedHashSet"); 
		 System.out.println("*************"); 
		 System.out.println(lh2);
		 System.out.println("*************"); 
			System.out.println(lh.size());
			System.out.println("*************"); 
			System.out.println(lh2.size());
			System.out.println("*************");
			System.out.println(lh.contains('A'));
			System.out.println("*************");
			System.out.println(lh2.contains('v'));
			 System.out.println("*************"); 
			 lh.removeAll(lh); 
			 lh2.removeAll(lh2);
			 System.out.println(lh);
			 System.out.println(lh2);
			 
}

}




