package Collection_Programs;

import java.util.TreeSet;



public class TreeSet_P2 {
	public static void main(String[] args) {
		
		TreeSet ts= new  TreeSet();
		ts.add(5843);
		ts.add(23454);
		ts.add(45667);
		ts.add(4567);
		
		TreeSet ts2= new  TreeSet();
		ts2.add(19864);
		ts2.add(1664);
		ts2.add(6234);
		ts2.add(265757);
		
		for(Object k:ts)
		System.out.println(k); 
		 System.out.println("*************"); 

		for(Object k2:ts2)
		System.out.println(k2);
		 System.out.println("*************"); 
	
	
		 ts2.remove(1664); 
		 ts.remove(45667); 
		 System.out.println("*************"); 
		 System.out.println(ts2);
		 System.out.println("*************"); 
			System.out.println(ts.size());
			System.out.println("*************"); 
			System.out.println(ts2.size());
			System.out.println("*************");
			System.out.println(ts.contains(67890));
			System.out.println("*************");
			System.out.println(ts2.contains(25111));
			 System.out.println("*************"); 
			 ts.removeAll(ts); 
			 ts2.removeAll(ts2);
			 System.out.println(ts);
			 System.out.println(ts2);
			 
}

}





