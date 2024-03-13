package Abstraction_Mon;

interface Car {
	void engine();

	
}

class Creta implements Car {
	public void engine() {
		System.out.println("1000cc");
	}
}

class MG implements Car {
	public void engine() {
		System.out.println("1500cc");
	}
}

class Audi implements Car {
	public void engine() {
		System.out.println("2000cc");
	}
}

class Demo_Mon2 {
	static void performOperation(Car a) 
	{

		a.engine();
	}
}

public class AbstractionMain2 {

	public static void main(String[] args) {
		Creta c = new Creta();
		MG d = new MG();
		Audi s = new Audi();
		Demo_Mon2.performOperation(c);
		Demo_Mon2.performOperation(d);
		Demo_Mon2.performOperation(s);

	}
}

