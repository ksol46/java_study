package test.ch14.vector;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();
		
		//데이터 추가
		scores.add(7);
		scores.add(4);
		scores.add(1);
		scores.add(5);
		scores.add(9);
		
		//오름차순
		for(Integer s : scores) {
			System.out.println(s + " "); //자동으로 정렬이 된다. 오름차순. 작->큰
			
		}
		System.out.println();
		
		System.out.println("가장 낮은 값: " + scores.first());
		System.out.println("가장 높은 값: " + scores.last());
		System.out.println("5보다 작은 값: " + scores.lower(5));
		System.out.println("5보다 큰 값: " + scores.higher(5));
	
		System.out.println();
		
		//내림차순
		NavigableSet<Integer> desc = scores.descendingSet();
		for(Integer s : desc) {
			System.out.println(s + " ");
			}
		
		System.out.println();
		//범위 검색 (5 <= score)
		//tailSet(값, boolean) : 주어진 값 보다 높은 값을 가져온다. boolean은 해당값을 포함하는지 안하는지.
		NavigableSet<Integer> rangeSet = scores.tailSet(5, true);
		System.out.println(rangeSet);
		for(Integer s : rangeSet) {
			System.out.println(s + " ");
		}
		
		System.out.println();
		
		//범위 검색 (4 <= score < 9 )
		rangeSet = scores.subSet(4, true, 9, false); //4는 포함(true)하고 9는 포함하지 않는다.(false)
		for (Integer s : rangeSet) {
			System.out.println(s + " ");
		}
	}
}
