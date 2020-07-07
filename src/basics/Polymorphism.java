package basics;

public class Polymorphism {
// i.e, Method OverLoading and Method OverRiding

	public static void main(String[] arg) {
		Overload overload = new Overload();
		overload.studentId(555);
		overload.studentId("Subbu");
		overload.studentId(868,"gmail");
		overload.studentId("gmail",989);
		
		OverRide overide = new OverRide();
		overide.studentId(555);
		overide.studentId("Subbu");
		overide.studentId(556, "myself");
		overide.studentId("gmail",989);
	}

	
}
