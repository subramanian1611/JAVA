package collections;

import java.util.ArrayList;

public class ListExample extends Data {

	public ListExample(int id, String name, String email) {
		setId(id);
		setEmail(email);
		setName(name);
	}

	public static void main(String[] args) {
		ArrayList<ListExample> emp = new ArrayList<ListExample>();
		ListExample L1 = new ListExample(100, "Subbu", "sk@gmail.com");
		emp.add(L1);
		ListExample L2 = new ListExample(101, "Mani", "mani@gmail.com");
		emp.add(L2);
		ListExample L3 = new ListExample(102, "subbumani", "subbumani@gmail.com");
		emp.add(L3);
		ListExample L4 = new ListExample(103, "kgsm", "kgsm@gmail.com");
		emp.add(L4);
		
		System.out.println(emp);
		
		for (ListExample l : emp) {
			System.out.println(l.getId()+"|"+l.getName()+"|"+l.getEmail());
		}
	}
}

class Data {
	private int id;
	private String name;
	private String email;

	protected int getId() {
		return id;
	}

	protected void setId(int id) {
		this.id = id;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected String getEmail() {
		return email;
	}

	protected void setEmail(String email) {
		this.email = email;
	}

}