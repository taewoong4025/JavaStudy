package ExJava;

import java.util.Scanner;

public class ExIfElse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int score;
		int year;
		
		System.out.print("������ �Է��ϼ���(0~100):");		
		score=sc.nextInt();
		System.out.print("�г��� �Է��ϼ���(1~4):");
		year=sc.nextInt();
		
		if(score>=60 && year<4) {
			System.out.println("�հ��Դϴ�.");

		}else if(score>=70 && year==4) {
			System.out.println("�հ��Դϴ�.");
		}
		else {
			System.out.println("���հ��Դϴ�.");
		}
	
		sc.close();
	}
	

}
