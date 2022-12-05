package test.ch15.lamda;

public class DogEx {

	public static void main(String[] args) {
		//1. 필드에 익명 자식 객체를 생성
		Dog retriever = new Dog() {
			String name = "뭉치";
			//짖는다. 라는 메소드
			void bark() {
				System.out.println("왈왈 짖는다.");
			}
			
			@Override
			void eat() {
				System.out.println("개는 소고기를 먹는다.");
			}
		};
		
		//2. 로컬변수의 초기값으로 대입
		
		

	}

}
