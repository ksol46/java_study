package test.ch07.poly;

public class AbstractEx {

	public static void main(String[] args) {
		Dog dog = new Dog();
//		dog.sound();
		
		Cat cat = new Cat();
//		cat.sound();
		
		//매개변수의 다형성
		animalSound(dog);
		animalSound(cat);

	}
	
	//메소드 생성                 //이것과 같다.(Animal animal = new Dog())
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
