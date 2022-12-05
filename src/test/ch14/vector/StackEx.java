package test.ch14.vector;

import java.util.Stack;
				//LIFO
public class StackEx {

	public static void main(String[] args) {
		//코인을 담아 줄 객체를 만들었음.
		Stack<Coin> coinBox = new Stack<Coin>();
		
		//coinBox안에 push넣는다.(객체 바로 생성해서 넣어줌)
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		//동전 꺼내기
					//inEmpty() : 비어있는지 확인하는 메소드이다.
		while(!coinBox.isEmpty()) { //비어있지 않다면 반복.
			Coin coin = coinBox.pop(); //가져오기
			System.out.println("꺼내온 동전은 " + coin.getValue());
		}
		
		//Stack은 LIFO이기 때문에 후입선출이다.
		//마지막에 들어간게 가장 먼저 나옴.
		

	}

}
