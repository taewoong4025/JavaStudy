package classPractice;

import java.util.Scanner;

public class Grade {
	int math;
	int science;
	int english;
	
	public Grade(int math, int science, int english) {
		super();
		this.math = math;
		this.science = science;
		this.english = english;
	}
	
	public int average() {
		return (math+science+english)/3;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("����, ����, ���� ������ 3���� ���� �Է�>>");
		int math = sc.nextInt();
		int science = sc.nextInt();
		int english = sc.nextInt();
		Grade grade = new Grade(math,science,english);
		
		System.out.println("����� "+grade.average());
		
		sc.close();
	}
}
