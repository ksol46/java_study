package test.ch11.Object;

import test.ch11.Object.Member;
					//extends Object 이 생략되어 있음, 상속
public class EqualsEx {

	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		
		if (obj1.equals(obj2)) {
			System.out.println("같습니다.");
		} else {
			
		} System.out.println("다릅니다.");
		
		if (obj1.equals(obj3)){
			System.out.print("같습니다.");
		} else {
			System.out.print("다릅니다.");			
		}
		
	}

}
