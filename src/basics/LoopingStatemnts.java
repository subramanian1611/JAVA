package basics;

public class LoopingStatemnts {

	public void ForLoop() {
		System.out.println("<<<---Start--->>>");
		for (int i = 1; i <= 3; i++) {
			System.out.println(i);
		}
		System.out.println("<<<<----End---->>>>");
	}

	public void InnerForLoop() {
		System.out.println();
			for (int i = 1; i <= 5; i++) {
				System.out.print(i+".");
				for (int j = 1; j <= 6; j++) {
					System.out.print(i);
				}
				System.out.println();
			}
		}
	
	public void whileLoop() {
		int i =0;
		System.out.println("While Loop Started");
		while (i<5) {
			i++;
			System.out.println(i);
		}
	}
	
	private void doWhileLoop() {
		System.out.println("Do While Loop Started");
		int j = 0;
		do {
			System.out.println(j);
			++j;
		} while (j<3);
	}
	
	public static void main(String[] args) {
		LoopingStatemnts stmts = new LoopingStatemnts();
		stmts.ForLoop();
		stmts.InnerForLoop();
		stmts.whileLoop();
		stmts.doWhileLoop();
	}
}