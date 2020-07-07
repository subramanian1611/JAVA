package basics;

public class Polymorphism_Overload {
	void studentId(int id) {
		System.out.println("Overload Integer is : " + id);
	}

	// above method and below method differs on Argument "Type"

	void studentId(String name) { 
		System.out.println("Overload String is : " + name);
	}

	// above method and below method differs on Argument "Count"

	void studentId(String email, int ph) {
		System.out.println("Overload String is : " + email);
		System.out.println("Overload Integer is : " + ph);
	}

	// above method and below method differs on Argument "Order"
	
	void studentId(int ph, String email) {
		System.out.println("Overload Integer is : " + ph);
		System.out.println("Overload String is : " + email);
	}
}
