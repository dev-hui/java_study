package july_17th_api;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();	// generic
		set.add("호크스");
		set.add("엔데버");
		set.add("이레이저 헤드");
		set.add("프레젠트 마이크");
		set.add("호크스");		// 중복된 값은 반영되지 않음
	 // set.add(1);		<< 사용 불가
		
	    Iterator iter = set.iterator();
	    while(iter.hasNext()) {
	    	System.out.println(iter.next());
	    }
		
	}
}
