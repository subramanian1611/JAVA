package basics;

public class ContinueAndBreak {

	public static void Break() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 6; j++) {
				System.out.println("I=" + i + "&J=" + j + "Before break");
				if (i == 3) {
					System.out.println("Number 3 Found");
					break;
				}
				System.out.println("After break");
			}
			System.out.println();
		}
	}

	public static void Continue() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 6; j++) {
				System.out.println("I=" + i + "&J=" + j + "Before Continue");
				if (i == 3) {
					System.out.println("Number 3 Found");
					continue;
				}
				System.out.println("After Continue");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Break();
		Continue();
	}
}
