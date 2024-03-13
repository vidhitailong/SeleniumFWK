package Abstraction_Mon;

interface Mobile {
	void Application();

	
}

class WhatsApp implements Mobile {
	public void Application() {
		System.out.println("Chatting");
	}
}

class Amazon implements Mobile {
	public void Application() {
		System.out.println("Shopping");
	}
}

class TrueCaller implements Mobile {
	public void Application() {
		System.out.println("Calling");
	}
}

class Demo_Mon3 {
	static void performOperation(Mobile a) 
	{

		a.Application();
	}
}

public class AbstractionMain3 {

	public static void main(String[] args) {
		WhatsApp c = new WhatsApp();
		Amazon d = new Amazon();
		TrueCaller s = new TrueCaller();
		Demo_Mon3.performOperation(c);
		Demo_Mon3.performOperation(d);
		Demo_Mon3.performOperation(s);

	}
}


