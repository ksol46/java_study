package test.ch14.vector;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

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
		String key = "김솔";
		int value = map.get(key);
		System.out.println("점수: " + value);
		
//		String key = "김영진";
//		int result = map.get(key);
//		System.out.println("점수: " + result);
//		System.out.println("점수: " + key.valueOf(result));
		
		//반복해서 키와 값을 얻기 1번째
		//한꺼번에 여러개의 키를 가져올 때 사용
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		
		//한꺼번에 여러개의 값을 얻기 위해서 사용한다.
		while(keyIterator.hasNext()) {}
		String k = keyIterator.next();
		Integer v = map.get(k);
		System.out.println(k + ":" + v);
		
		//반복해서 키와 값을 얻기 2번째
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while (entryIterator.hasNext()) { //다음 키가 있는지 찾는다.
			Entry<String, Integer> entry = entryIterator.next();
			String k1 = entry.getKey();
			Integer v1 = entry.getValue();
			System.out.println(k1 + ":" + v1);
		}
		
		
		
		
		
		
	}

}
