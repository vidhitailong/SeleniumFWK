package Collection_Programs;

import java.util.HashSet;



public class HashSet_P2 {
	public static void main(String[] args) {
		
		 HashSet p= new  HashSet();
		p.add(1643);
		p.add("Hello HashSet");
		p.add('T');
		p.add(true);
		
		 HashSet p2= new  HashSet();
		p2.add(11464);
		p2.add("Hello Java");
		p2.add('I');
		p2.add(false);
		
		for(Object o:p)
		System.out.println(o); 
		 System.out.println("*************"); 

		for(Object o2:p2)
		System.out.println(o2);
		 System.out.println("*************"); 
	
	
		 p2.remove(false); 
		 p.remove("Hello HashSet"); 
		 System.out.println("*************"); 
		 System.out.println(p2);
		 System.out.println("*************"); 
			System.out.println(p.size());
			System.out.println("*************"); 
			System.out.println(p2.size());
			System.out.println("*************");
			System.out.println(p.contains('A'));
			System.out.println("*************");
			System.out.println(p2.contains('v'));
			 System.out.println("*************"); 
			 p.removeAll(p); 
			 p2.removeAll(p2);
			 System.out.println(p);
			 System.out.println(p2);
			 
}

}



