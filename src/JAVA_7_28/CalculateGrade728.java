package JAVA_7_28;

import java.util.Scanner;

public class CalculateGrade728 {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
		boolean cheating;
		int attendrate;
		int totalscore;
		char grade;
		
		System.out.print("�������� ����(true Ȥ�� false) : ");
		cheating = sc.nextBoolean();
		System.out.print("�⼮��(0~100������ ������) : ");
		attendrate = sc.nextInt();
		System.out.print("����(0~100������ ������) : ");
		totalscore = sc.nextInt();
		
		if(cheating == true) {
			grade='F';
		
		}
		else if (attendrate < 80) {
			grade='F';
		}
		
		else {
			if(totalscore >= 90) {
				grade='A';
			}
			else if(totalscore >= 80) {
				grade='B';
			}
			else if(totalscore >= 70) {
				grade='C';
			}
			else if(totalscore >= 60) {
				grade='D';
			}else {
				grade='F';
			}
		}
		
		System.out.println("���� = " + grade);

		sc.close();
	}

}
