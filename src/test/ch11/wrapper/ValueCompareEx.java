package test.ch11.wrapper;

public class ValueCompareEx {

	public static void main(String[] args) {
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println(obj1 == obj2); //객체라서 ==표시는 쓸 수 없다.
		System.out.println(obj1.equals(obj2));
		System.out.println();
	
		/* <예외>
		 * [값을 비교하는 타입]
		 * Boolean
		 * Character
		 * Byte, Short, Integer : -128 ~ 127
		 * 위 타입과 범위 안에 있는 숫자는 값으로 비교해준다.
		 */
		
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println(obj3 == obj4);
		System.out.println(obj3.equals(obj4));
		
	}

}
