package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Set_Tree {

	public static void main(String[] args) {
		Set<Integer> ex = new TreeSet<Integer>();
		ex.add(10);
		ex.add(10);
		ex.add(1000);
		
		System.out.println("Print Full Array :" + ex);

		System.out.println("Size is :" + ex.size());

		for (Object i : ex) {
			System.out.println("Value : " + i);
		}

		ex.remove(100);
		System.out.println("Full Array after Remove :" + ex);
		for (Object i : ex) {
			System.out.println("Value : " + i);
		}

		ex.add(100000);
		System.out.println("Full Array after Added with index :" + ex);
		for (Object i : ex) {
			System.out.println("Value : " + i);
		}
		System.out.println("Check whether Subbu is present in the aray list :"+ ex.contains(100000));

		List<Object> ex1 = new ArrayList<>();
		ex1.addAll(ex);
		
		System.out.println(ex1.removeAll(ex));
		
		System.out.println(ex1.retainAll(ex));
	
		ex.clear();
		System.out.println("list after clear :"+ex);
	}
}