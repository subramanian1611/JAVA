package basics;

import java.util.Scanner;

public class FetchValueAtRunTime {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);	//Scanner class with the argument "System.in" is used to get the user input
		System.out.print("Enter a Number : ");
		int number = sc.nextInt();
		System.out.print("Enter a Boolean : ");
		boolean bool = sc.nextBoolean();
		System.out.println("--------------------------");
		System.out.println("Entered Number is : "+number);
		System.out.println("Entered Boolean is : "+bool);
	}
	
}
