package JavaEx1;

import java.util.Scanner;

public class Multiple {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number;
		boolean multiple = false;
		
		System.out.println("���� ������ �Է��ϼ��� : ");
		number=sc.nextInt();
		
		if(number%3==0) {
			System.out.println("3�ǹ���̴�.");
			multiple=true;
		}
		 if(number%5==0) {
			System.out.println("5�ǹ���̴�.");
			multiple=true;
		}
		 if(number%8==0) {
			 System.out.println("8�ǹ���̴�.");
			 multiple=true;
		 }
		
		 if(!multiple) {
			 System.out.println("��� ����� �ƴϴ�.");
		 }
		
		sc.close();
	}
}
