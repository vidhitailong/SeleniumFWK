package Abstraction_Mon;

interface Bank {
	void paymentSecurity();
}

class UnionBank implements Bank {
	public void paymentSecurity() {
		System.out.println("Secure");
	}
}

class SBIBank implements Bank {
	public void paymentSecurity() {
		System.out.println("Highly Secure");
	}
}

class CanaraBank implements Bank {
	public void paymentSecurity() {
		System.out.println("PIN Required");
	}
}

class Demo_Mon1 {
	static void ansim2(Bank a) {

		a.paymentSecurity();
	}
}

public class AbstractionMain1 {

	public static void main(String[] args) {
		UnionBank c = new UnionBank();
		UnionBank d = new UnionBank();
		CanaraBank s = new CanaraBank();
		Demo_Mon1.ansim2(c);
		Demo_Mon1.ansim2(d);
		Demo_Mon1.ansim2(s);

	}
}
