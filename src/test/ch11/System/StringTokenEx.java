package test.ch11.System;

import java.util.StringTokenizer;

public class StringTokenEx {

	public static void main(String[] args) {
		String data1 = "홍길동&이수홍,박연수";
		
		String[] arr = data1.split("&|,"); //& 또는 , 이라는 의미. 문자열을 저 기준으로 끊겠다라는 뜻.
		for(String token : arr) {
			System.out.println(token);
		}
		
		String data2 = "홍길동/이수홍/박연수";
		StringTokenizer st = new StringTokenizer(data2, "/");
		System.out.println(st.countTokens());
		
		
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
		
	}

}
