package Collection_Programs;

import java.util.ArrayList;


public class ArrayList_P5 {
	
	public static void main(String[] args) {
		
		ArrayList l1= new ArrayList();
		
		l1.add(1);
		l1.add("hello");
		l1.add('A');
		
		System.out.println(l1.size());
		System.out.println(l1.contains('A'));
		Object value=l1.get(2);
		System.out.println(value);

}
}
