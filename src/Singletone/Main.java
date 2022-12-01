package Singletone;
//한 개의 객체만을 생성해야 할 때.
public class Main {

	public static void main(String[] args) {
		User[] user = new User[10]; //user객체를 담을 배열을 정의.

		for(int i=0; i<user.length; i++) {
			//user객체를 생성해서 배열에 넣어준다.
			user[i] = new User("user" + i); //user0, user1, ...
			//생성한 객체에서 print()메소드 실행
			user[i].print();
		}
		
	}

}
