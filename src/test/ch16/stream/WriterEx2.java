package test.ch16.stream;

import java.io.FileOutputStream;

public class WriterEx2 {

	public static void main(String[] args) {
		try {
			//출력 스트림
			FileOutputStream fo = new FileOutputStream("C:/Temp/test2.db"); //파일을 만든다.
			
			byte[] array = {10, 20, 30};
			/* ---------------------------
				 	30 / 20 / 10 배열 그대로 저장됨.
			  -----------------------------
			 */
			
			fo.write(array);
			
			fo.flush(); //버퍼에 있는 바이트를 출력하고 버퍼를 비움(test1.db에 작성된다.);
			
			fo.close(); //출력 스트림은 반드시 닫아서 사용한 메모리를 해제한다. 메모리가 낭비 될 수 있음.
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
