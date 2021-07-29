package ExJava;

import java.util.Scanner;

public class ExTime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int time; //60초 = 1분 , 60분  = 1시간.
		int hour;
		int minute;
		int second;
		
		System.out.print("정수를 입력하세요 : ");
		time=sc.nextInt();
		
		hour = time/3600;
		minute = (time/60) % 60;
		second = time%60;
		System.out.println(time+"초는 "+hour+"시간, "+minute+"분, "+second+"초입니다.");
		sc.close();
		
	}
}
