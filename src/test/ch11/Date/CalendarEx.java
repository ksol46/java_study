package test.ch11.Date;

import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance(); //현재시간과 날짜를 가져온다.
									//타임존(국적 등)을 따로 설정하지 않으면 아무것도 쓰지 않아도됨!
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1; //이미 1이 마이너스 된거라 +1해준다.
		int day = now.get(Calendar.DAY_OF_MONTH); //일
		int week = now.get(Calendar.DAY_OF_WEEK); //요일 일요일:1 ~ 토요일:7
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(week);
		
		String strWeek = null;
		
		switch(week) {
		case Calendar.MONDAY: strWeek = "월"; break;
		case Calendar.TUESDAY: strWeek = "화"; break;
		case Calendar.WEDNESDAY: strWeek = "수"; break;
		case Calendar.THURSDAY: strWeek = "목"; break;
		case Calendar.FRIDAY: strWeek = "금"; break;
		case Calendar.SATURDAY: strWeek = "토"; break;
		case Calendar.SUNDAY: strWeek = "일"; break;
		
		}
		System.out.println(strWeek);
		
		int amPm = now.get(Calendar.AM_PM); //am,pm인지 나타내준다.(0:am 1:pm)
		System.out.println(amPm);
		System.out.println(Calendar.AM);
		
		if(amPm == Calendar.AM) {
			System.out.println("오전");
		} else {
			System.out.println("오후");
		}
		
		System.out.println(now.get(Calendar.HOUR) + "," + now.get(Calendar.MINUTE) + "," + now.get(Calendar.SECOND));
		//HOUR: 오전/오후 기분(0~11)
		
		
	}

}
