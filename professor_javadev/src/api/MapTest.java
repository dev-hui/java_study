package api;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		map.put("박지민", "010-1111-1111");
		map.put("손흥민", "010-1111-1112");
		map.put("안정환", "010-1111-1113");
		map.put("안제현", "010-1111-1114");

		System.out.println(map.get("안제현"));
		
		for(String key : map.keySet()) {
			System.out.println(key + ":" + map.get(key));
		}
	}
}
