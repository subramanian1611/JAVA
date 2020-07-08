package collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Set_LinkedHash {

	public static void main(String[] args) {
		Set<Object> ex = new LinkedHashSet<Object>();
		ex.add(10);
		ex.add(1000l);
		ex.add(10.12f);
		ex.add("Hai");
		ex.add('A');
		ex.add(true);
		System.out.println("Print Full Array :" + ex);

		System.out.println("Size is :" + ex.size());

		for (Object i : ex) {
			System.out.println("Value : " + i);
		}

		ex.remove('A');
		System.out.println("Full Array after Remove :" + ex);
		for (Object i : ex) {
			System.out.println("Value : " + i);
		}

		ex.add("Subbu");
		System.out.println("Full Array after Added with index :" + ex);
		for (Object i : ex) {
			System.out.println("Value : " + i);
		}
		System.out.println("Check whether Subbu is present in the aray list :"+ ex.contains((Object)"Subbu"));

		List<Object> ex1 = new ArrayList<>();
		ex1.addAll(ex);
		
		System.out.println(ex1.removeAll(ex));
		
		System.out.println(ex1.retainAll(ex));
	
		ex.clear();
		System.out.println("list after clear :"+ex);
	}
}