package Collection_Programs;

import java.util.Stack;



public class Stack_P1 {
	public static void main(String[] args) {
		
		Stack s= new Stack();
		s.add(232);
		s.add("Good Evening");
		s.add('F');
		s.add(false);
		
		Stack s2= new Stack();
		s2.add(145);
		s2.add("Good Morning");
		s2.add('G');
		s2.add(true);
		
		for(Object o:s)
		System.out.println(o); 
		System.out.println("*************"); 
		for(Object o2:s2)
		System.out.println(o2);
		System.out.println("*************"); 
		
	 s.addAll(1,s2);
	 System.out.println(s);
	 
	
		 s2.remove(true); 
		 s.remove("Good Evening"); 
		 System.out.println("*************"); 
		 System.out.println(s2);
		 System.out.println("*************"); 
			System.out.println(s.size());
			System.out.println("*************"); 
			System.out.println(s2.size());
			System.out.println("*************");
			System.out.println(s.contains('A'));
			System.out.println("*************");
			System.out.println(s2.contains('G'));
			 System.out.println("*************"); 
			 s.removeAll(s); 
			 s2.removeAll(s2);
			 System.out.println(s);
			 System.out.println(s2);
			 
}

}



