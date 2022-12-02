package test.ch14.vector;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
//		Set<String> set = new HashSet<String>();
		HashSet<String> set = new HashSet<String>();

		set.add("java");
		set.add("jdbc");
		set.add("jsp");
		set.add("java");
		
		System.out.println(set);
		
		int size = set.size();
		System.out.println(size);
		
		//set은 중복된것을 저장하지 않는다!!!!!
	
	}

}
