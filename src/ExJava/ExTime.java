package ExJava;

import java.util.Scanner;

public class ExTime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int time; //60�� = 1�� , 60��  = 1�ð�.
		int hour;
		int minute;
		int second;
		
		System.out.print("������ �Է��ϼ��� : ");
		time=sc.nextInt();
		
		hour = time/3600;
		minute = (time/60) % 60;
		second = time%60;
		System.out.println(time+"�ʴ� "+hour+"�ð�, "+minute+"��, "+second+"���Դϴ�.");
		sc.close();
		
	}
}
