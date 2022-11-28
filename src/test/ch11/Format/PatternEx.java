package test.ch11.Format;

import java.util.regex.Pattern;

public class PatternEx {

	public static void main(String[] args) {
		/*
		 * 02-222-2222
		 * 010-2222-1234 형식으로 출력
		 */
					/* 010|02 : 010또는02 -
					 * \d : 한 개의 숫자,[0-9화 동일] / {3,4} : 3개부터 4개까지  -
					 * \d : 한 개의 숫자,[0-9화 동일] / {4} : 정확히 4개
					 * 이스케이프 문자가 sting타입에서는 인식을 잘 못해서 \ 앞에는 \한 개 더 붙여준다..
					 */
		String regExp = "(010|02)-\\d{3,4}-\\d{4}"; //패턴을 넣을 문자열, 전화번호 체크
		String data = "010-123-4567";
		
		boolean result = Pattern.matches(regExp, data); //matches(패턴, 검증하고 싶은 데이터)
		
		/*
		 * doomee88@naver.com
		 * 이메일 형식
		 */
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "doomee88@naver.com";
		
		result = Pattern.matches(regExp, data);
		
		
		
	}

}
