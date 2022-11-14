package test.ch05;

import java.util.Calendar;

public class WeekEX {

	public static void main(String[] args) {
		Week today = null;
		//변수 선언을 한다.
		Calendar cal = Calendar.getInstance();
		//week안에 요일을 숫자로 얻는다.
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		//숫자를 열거 상수로 변환해서 변수에 대입한다.
		switch(week) {
		case 1: today = Week.SUNDAY; break;
		case 2: today = Week.MONDAY; break;
		case 3: today = Week.TUSEDAY; break;
		case 4: today = Week.WEDNESDAY; break;
		case 5: today = Week.THURSDAY; break;
		case 6: today = Week.FRIDAY; break; 
		case 7: today = Week.SATURDAY; break;
		
		}
		
		if(today == Week.FRIDAY) {
			System.out.println("금요일 입니다.");
		} else {
			System.out.println("금요일 아닙니다.");
		}
		
		
	}

}
