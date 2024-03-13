package oops_concept;

	
interface Bank1 {
		void paymentSecurity1();
	}

	class UnionB implements Bank1 {
		public void paymentSecurity1() {
			System.out.println("Secure");
		}
	}

	class Union implements Bank1 {
		public void paymentSecurity1() {
			System.out.println("Highly Secure");
		}
	}

	class Canarab implements Bank1 {
		public void paymentSecurity1() {
			System.out.println("PIN Required");
		}
	}

	class Demo_Mon10 {
		static void ansim2(Bank1 a) {

			a.paymentSecurity1();
		}
	}

	public class Abstraction_pg {

		public static void main(String[] args) {
			UnionB c = new UnionB();
			Union d = new Union();
			Canarab s = new Canarab();
			Demo_Mon10.ansim2(c);
			Demo_Mon10.ansim2(d);
			Demo_Mon10.ansim2(s);

		}
	


}

