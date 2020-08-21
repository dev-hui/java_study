package july_17th_api;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		List<String> list = new ArrayList();		// 순서 있고, 중복도 반영
		
		list.add("데쿠");
		list.add("쇼토");
		list.add("에리");
		list.add("토가");
		list.add("쇼토");
		
		/*for(int i = 0 ; i < list.size(); i++) {
			System.out.println(list.get(i));
		}*/
		
		for (String name : list) {
			System.out.println(name);
		}
	}
}
