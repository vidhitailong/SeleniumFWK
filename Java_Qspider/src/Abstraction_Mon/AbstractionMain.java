package Abstraction_Mon;

interface Animal {
	void noise();
}

class Cat implements Animal {
	public void noise() {
System.out.println("Meow Meow");
	}
}
	
	class Dog implements Animal
	{
		public void noise()
		{
			System.out.println("Bow Bow");
		}
	}
	class Snake implements Animal
	{
		public void noise()
		{
			System.out.println("HIssss");
		}
	}

	class Demo_Mon
	{
		static void ansim1(Animal a)
		{
	
	a.noise();
	}
	}
	
public class AbstractionMain {

	public static void main(String[] args) {
		Cat c= new Cat();
		Dog d= new Dog();
		Snake s= new Snake();
		Demo_Mon.ansim1(c);
		Demo_Mon.ansim1(d);
		Demo_Mon.ansim1(s);
		
		
		
	}
}
