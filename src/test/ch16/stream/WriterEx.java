package test.ch16.stream;

import java.io.FileOutputStream;

public class WriterEx {

	public static void main(String[] args) {
		try {
			//출력 스트림
			FileOutputStream fo = new FileOutputStream("C:/Temp/test1.db"); //파일을 만든다.
			
			byte a = 10;
			byte b = 20;
			byte c = 30;
			
			//write() : buffer에 사용됐다. 파일을 아직 만들지 않았음.
			fo.write(a); //1byte씩 buffer에 모아놓는다.
			fo.write(b);
			fo.write(c);
			
			fo.flush(); //버퍼에 있는 바이트를 출력하고 버퍼를 비움(test1.db에 작성된다.);
			
			fo.close(); //출력 스트림은 반드시 닫아서 사용한 메모리를 해제한다. 메모리가 낭비 될 수 있음.
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
