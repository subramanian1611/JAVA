package collections;

import java.util.ArrayList;
import java.util.List;

public class List_Array {

	public static void main(String[] args) {
		List<Object> ex = new ArrayList<Object>();
		ex.add(10);
		ex.add(1000l);
		ex.add(10.12f);
		ex.add("Hai");
		ex.add("A");
		ex.add(true);
		System.out.println("Print Full Array :" + ex);

		System.out.println("Size is :" + ex.size());

		System.out.println("Vaue at index 2 is" + ex.get(2));

		for (Object i : ex) {
			System.out.println("Value at "+ex.indexOf(i)+": " + i);
		}

		ex.remove(3);
		System.out.println("Full Array after Remove :" + ex);
		for (Object i : ex) {
			System.out.println("Value at "+ex.indexOf(i)+": " + i);
		}

		ex.add(3, "Subbu");
		System.out.println("Full Array after Added with index :" + ex);
		for (Object i : ex) {
			System.out.println("Value at "+ex.indexOf(i)+": " + i);
		}
		System.out.println("Check whether Subbu is present in the aray list :"+ ex.contains((Object)"Subbu"));
		
		System.out.println("Index of subbu is :"+ex.indexOf((Object)"Subbu"));

		List<Object> ex1 = new ArrayList<>();
		ex1.addAll(ex);
		
		System.out.println(ex1.removeAll(ex));
		
		System.out.println(ex1.retainAll(ex));
	
		ex.clear();
		System.out.println("list after clear :"+ex);
	}
}