package chap06;

import java.util.Calendar;

public class CalendarEx {
	public static void printCalendar(String msg, Calendar cal) {
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		int hour = cal.get(Calendar.HOUR);
		int hourOfDay = cal.get(Calendar.HOUR_OF_DAY); //24시 기준으로 한 시간.
		int ampm = cal.get(Calendar.AM_PM);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int millisecond = cal.get(Calendar.MILLISECOND);

		System.out.print(msg+year+"-"+month+"-"+day+".");

		switch (dayOfWeek) {
		case Calendar.SUNDAY:
			System.out.print("일요일 ");	
			break;
		case Calendar.MONDAY:
			System.out.print("월요일 ");	
			break;
		case Calendar.TUESDAY:
			System.out.print("화요일 ");	
			break;
		case Calendar.WEDNESDAY:
			System.out.print("수요일 ");	
			break;
		case Calendar.THURSDAY:
			System.out.print("목요일 ");	
			break;
		case Calendar.FRIDAY:
			System.out.print("금요일 ");	
			break;
		case Calendar.SATURDAY:
			System.out.print("토요일 ");	
			break;
		}


		if(ampm==Calendar.AM) {
			System.out.print("오전");
		}
		else {
			System.out.print("오후");
		}

		System.out.print(" ("+hourOfDay+"시) ");
		System.out.print(hour+"시 "+minute+"분 "+second+"초 "+millisecond+"밀리초");
	}

	public static void main(String[] args) {

		Calendar now = Calendar.getInstance(); //추상 클래스이므로 
		printCalendar("현재 ", now);
		
		Calendar firstDate = Calendar.getInstance();
		
		firstDate.clear();
		firstDate.set(2016, 11, 25);
		firstDate.set(Calendar.HOUR_OF_DAY, 20);
		firstDate.set(Calendar.MINUTE, 30);
		System.out.println();
		printCalendar("처음 데이트한 날은 ", firstDate);

	}
}
