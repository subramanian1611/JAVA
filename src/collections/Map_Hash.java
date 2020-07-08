package collections;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Map_Hash {

	public static void main(String[] args) {
		Map<Integer,String> ex = new ConcurrentHashMap<Integer,String>();
		ex.put(10,"Fire");
		ex.put(11,"Subbu");
		ex.put(12,"Mani");
		
		System.out.println("Print Full Array :" + ex);

		System.out.println("Size is :" + ex.size());

		ex.remove(10,"Fire");
		System.out.println("Full Array after Remove :" + ex);
		Set<Entry<Integer, String>> s = ex.entrySet();
		for(Entry<Integer, String> x:s){
		System.out.println(x.getKey());
		System.out.println(x.getValue());
		}

		ex.put(13,"Sk");
		System.out.println("Full Array after Added with index :" + ex);
		Set<Entry<Integer, String>> s1 = ex.entrySet();
		for(Entry<Integer, String> x:s1){
		System.out.println(x.getKey());
		System.out.println(x.getValue());
		}
		
		System.out.println("Value for key 11 is :"+ex.get(11));
		
		System.out.println("Check whether Subbu is present in the aray list :"+ ex.containsKey(100000));
		System.out.println("Check whether Subbu is present in the aray list :"+ ex.containsValue("Subbu"));
		
		Set<Entry<Integer, String>> s11 = ex.entrySet();
		for(Entry<Integer, String> x:s11){
		System.out.println(x.getKey());
		System.out.println(x.getValue());
		}

		
		Set<Integer> k = ex.keySet();
		System.out.println("Key set is :"+k);

		Collection<String> v = ex.values();
		System.out.println("Value Collection is :"+v);
		
		ex.clear();
		System.out.println("list after clear :"+ex);
		
	}
}