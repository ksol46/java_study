package test.ch10;

public class ExceptionEx3 {

	public static void main(String[] args) {
		String[] array = {"100", "1ㅇㅇ"};
		
		for (int i=0; i<=array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]); //int형 데이터로 바꿔줌. 형변환.
				System.out.println("array[" + i + "]:" + value);
			} catch(ArrayIndexOutOfBoundsException e) { //ctrl + space 단축키로 선택
				e.printStackTrace();
			} catch(Exception e) {
				e.printStackTrace();
			}
		
		}

	}

}
			//exception만 써줘도 실행 결과는 똑같음 밑에 와야 한다.
			//exception이라는 이름의 에러가 얻어걸려서 해결이 됨.
