package Collection_Programs;
import java.util.Vector;



public class Vector_P2 {
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
	
		v.addAll(0,v2);
		
		for(Object o:v)
		{
		System.out.println(o);
		}
		
	}
}
		

