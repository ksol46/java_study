package test.ch12;

public class GenericEx {

	public static void main(String[] args) {
		                       	//<>는 비워도 된다.
		//Box<String> box1 = new Box<String>();
		Box<String> box1 = new Box<>();
		box1.content = "안녕하세요";
		String str = box1.content;
		System.out.println(str);
		
		Box<Integer> box2 = new Box<>();
		box2.content = 406;
		int num = box2.content;
		System.out.println(num);
	}

}
