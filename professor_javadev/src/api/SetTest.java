package api;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();	//generic
		set.add("브레드피트");
		set.add("장동건");
		set.add("원빈");
		set.add("김경욱");
		set.add("원빈");
		//set.add(1);
		
		Iterator iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
	}
}
