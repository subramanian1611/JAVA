package basics;

public class Abstraction extends Abstraction_PartialOrClass implements Abstraction_FullOrInterface{

	@Override
	void abstractClassMethod1() {
		System.out.println("Abstaction_class Method 1 implemented in subclass");
	}

	@Override
	void abstractClassMethod2() {
		System.out.println("Abstaction_class Method 2 implemented in subclass");
	}

	@Override
	public void interfaceMethod1() {
		System.out.println("Interface Method 1 implemented in subClass");
		
	}

	@Override
	public void interfaceMethod2() {
		System.out.println("Interface Method 2 implemented in subClass");
		
	}

	public static void main(String[] args) {
		Abstraction abs = new Abstraction();
		abs.abstractClassMethod1();
		abs.abstractClassMethod2();
		abs.abstractClassMethodImplemented();
		abs.interfaceMethod1();
		abs.interfaceMethod2();
		
		Abstraction_PartialOrClass abs1 = new Abstraction();
		abs1.abstractClassMethod1();
		abs1.abstractClassMethod2();
		abs1.abstractClassMethodImplemented();

		Abstraction_FullOrInterface abs11 = new Abstraction();
		abs11.interfaceMethod1();
		abs11.interfaceMethod2();
	}
}
