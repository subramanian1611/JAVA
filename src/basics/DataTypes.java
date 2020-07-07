package basics;

public class DataTypes {

	static byte byteVariable = 5;
	static short shortVariable = 10;
	static int intVariable = 1000;
	static long longvariable = 10000l;	//l need to be specified for long values
	
	static float floatVariable = 4.4f;	//f need to be specified for float values 
	static double doubleVariable = 66.7d;	//d need to be specified for double value
	
	static boolean booleanVariable = true;
	
	static char charVariable = 'c';	//character type value should be inside single cotes
	
	static String stringVariable = "MY NAME IS SUBRAMANIAN.K";	//string should be inside double cotes
	
	public static void main(String[] args) {
		System.out.println("Byte Variable is :"+byteVariable);
		System.out.println("Short Variable is :"+shortVariable);
		System.out.println("Integer Variable is :"+intVariable);
		System.out.println("Long Variable is :"+longvariable);
		System.out.println("Float Variable is :"+floatVariable);
		System.out.println("Double Variable is :"+doubleVariable);
		System.out.println("Boolean Variable is :"+booleanVariable);
		System.out.println("Character Variable is :"+charVariable);
		System.out.println("String Variable is :"+stringVariable);
	}
	
}
