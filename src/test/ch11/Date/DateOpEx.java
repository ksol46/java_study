package test.ch11.Date;
//날짜 시간을 출력하고 더해주고 빼주고 등등 여러가지 기능을 추가해 줄 수 있다!!!!
//날짜와 관련된 일에 사용 할 수 있음!
import java.time.LocalDateTime; //문서 java time -> LocalDateTime
import java.time.format.DateTimeFormatter;

public class DateOpEx {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now(); //현재 날짜 시간
		
		//데이터 포맷 형태
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
		
		System.out.println("현재시간: " + now.format(dtf));
		
		LocalDateTime result1 = now.plusYears(1); // 1년을 더 했음
		System.out.println(result1);
		System.out.println(result1.format(dtf));
		
		LocalDateTime result2 = now.minusMonths(2); // 2개월을 뺐음
		System.out.println(result2);
		System.out.println(result2.format(dtf));
		
		LocalDateTime result3 = now.plusDays(7); // 7일을 더했음
		System.out.println(result3);
		System.out.println(result3.format(dtf));
		
	}
	


}
