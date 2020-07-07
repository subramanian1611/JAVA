package basics;

public class OverRide extends Overload{

	void studentId(int id) {
		System.out.println("Over Ride Integer is : " + id);
	}

	void studentId(String name) { 
		System.out.println("Over Ride String is : " + name);
	}
	
	void studentId(int dob, String add) {
		System.out.println("Over Ride of Integer : "+dob);
		System.out.println("Over Ride of Strring : "+add);
	}

	void studentId(String email, int ph) {
		System.out.println("Over Ride String is : " + email);
		System.out.println("Over Ride Integer is : " + ph);
	}
}
