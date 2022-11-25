package test.ch11.String;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class ByteToStringEx {

	public static void main(String[] args) {
		String data = "자바";
		
		byte[] arr1 = data.getBytes("UTF-8"); //-> uft-8로 인코딩, 비어있어도 디폴트 값이라 괜찮다.
		System.out.println(Arrays.toString(arr1)); //배열을 문자열로 바꾼다.

		String str1 = new String(arr, "UTF-8" //ufp 디코딩)
				System.out.println(str1); //배열을 문자열로 바꾼다.
	}

}
