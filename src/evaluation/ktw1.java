package evaluation;

import java.util.Scanner;

public class ktw1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double volume;
		
		System.out.print("���� ���� ���� �������� �Է��ϼ���:");
		int radius = sc.nextInt();
		
		System.out.print("������ ���̸� �Է��ϼ���:");
		int height = sc.nextInt();
		
		volume = (Math.PI*radius*radius*height)/3;// 1/3*pi*r*r*h;
		
		System.out.println("���� ���� ���� ������ : "+(double)radius);
		System.out.println("������ ���� : "+(double)height);
		System.out.print("������ ���� : "+ volume);
		
		sc.close();
	}

}
