package api;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("김태희");
		list.add("전지현");
		list.add("송혜교");
		list.add("김양현");
		list.add("전지현");
		
		/*for(int i=0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}*/
		
		for(String name : list) {
			System.out.println(name);
		}
	}
}
