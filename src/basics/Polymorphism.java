package basics;

public class Polymorphism {
// i.e, Method OverLoading and Method OverRiding

	public static void main(String[] arg) {
		Polymorphism_Overload overload = new Polymorphism_Overload();
		overload.studentId(555);
		overload.studentId("Subbu");
		overload.studentId(868,"gmail");
		overload.studentId("gmail",989);
		
		Polymorphism_OverRide overide = new Polymorphism_OverRide();
		overide.studentId(555);
		overide.studentId("Subbu");
		overide.studentId(556, "myself");
		overide.studentId("gmail",989);
		
		Polymorphism_Overload mix = new Polymorphism_OverRide();
		mix.studentId(6666);
		mix.studentId("Mani");
		mix.studentId(222,"Mani");
		mix.studentId("Mani", 333);
		
	/*	OverRide mix = new Overload();
	 * is not allowed, since the overload is the super class of the OverRide class
	 * casting also will not work
	 */
	}
}
