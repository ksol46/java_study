package test.ch14.vector;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		//HashMap<key, 객체(저장할 값)>
		HashMap<String, Integer> map = new HashMap<>();
				//key  값
		map.put("김솔", 100);
		map.put("김영진", 85);
		map.put("송정희", 95); //한 개의 entry
		
		System.out.println(map);
		System.out.println("총 Entry 수: " + map.size());
		
		//키로 값 얻기
//		String key = "김솔";
//		int value = map.get(key);
//		System.out.println("점수: " + value);
		
		String key = "김영진";
		int result = map.get(key);
		System.out.println("점수: " + result);
		System.out.println("점수: " + key.valueOf(result));
	}

}
