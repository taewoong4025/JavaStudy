package JavaEx2;

import java.util.Scanner;

public class DivdeByZero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dividend; // ����
		int divisor; // �и�
		
		System.out.print("���ڸ� �Է��Ͻÿ�>>");
		dividend = sc.nextInt();

		System.out.print("�и� �Է��Ͻÿ�>>");
		divisor = sc.nextInt();
		
		System.out.println(dividend+"��"+divisor+"�� ������ ����"+dividend/divisor+"�Դϴ�.");	
	
		sc.close();
	}
}
