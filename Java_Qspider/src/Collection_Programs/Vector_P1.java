package Collection_Programs;
import java.util.Vector;


public class Vector_P1 {
	public static void main(String[] args) {
		
		Vector v= new Vector();
		v.add(1);
		v.add("hello");
		v.add('A');
		v.add(true);
		
		for(Object o:v)
		{
		System.out.println(o);
		}
	}

}
