package test.ch11.Date;

import java.text.SimpleDateFormat;
import java.util.Date;
				//위 자리에 * 라고 표시하면 util안에 있는 모든 것들을 가져올 수 있다는 뜻이다!

public class DateEx {

	public static void main(String[] args) {
		Date now = new Date(); //현재 날짜와 시간 생성
		System.out.println(now);
		
		//위 아래 출력값은 똑같지만 타입이 다르다.
		//나중에 DB로 넘겨줄 때 스트링으로 넘겨줘야 할 때가 있는데 그때 사용하면 된다!
		
		String strNow1 = now.toString(); //문자열로 변경!
		System.out.println(strNow1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH: mm ss"); //얘도 import해준다!
		String strNow2 = sdf.format(now); //괄호 안 날짜 객체를 넣어줘야 한다.
											//포맷상태의 객체
		System.out.println(strNow2);
	}

}
