package test.ch10;

public class ExceptionEx4 {

	public static void main(String[] args) {
		String[] array = {"100", "1ㅇㅇ", null, "200"};
		
		for (int i=0; i<=array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]); //int형 데이터로 바꿔줌. 형변환.
				System.out.println("array[" + i + "]:" + value);
			} catch(ArrayIndexOutOfBoundsException e) { //ctrl + space 단축키로 선택
				e.printStackTrace();
			} catch(NullPointerException | NumberFormatException e) {//2가지 이상의 예외를 동일하게 처리
				System.out.println("데이터에 문제가 있음: " + e.getMessage());
			}
		
		}

	}

}
			//exception만 써줘도 실행 결과는 똑같음 밑에 와야 한다.
			//exception이라는 이름의 에러가 얻어걸려서 해결이 됨.
