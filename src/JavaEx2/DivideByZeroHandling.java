package JavaEx2;

import java.util.Scanner;

public class DivideByZeroHandling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dividend; // ����
		int divisor; // �и�
		
		while (true) {
			System.out.print("���ڸ� �Է��Ͻÿ�>>");
			dividend = sc.nextInt();

			System.out.print("�и� �Է��Ͻÿ�>>");
			divisor = sc.nextInt();

			try {
				System.out.println(dividend+"��"+divisor+"�� ������ ����"+dividend/divisor+"�Դϴ�.");
				break;
			} catch (ArithmeticException e) {
				System.out.println("0���� ���� �� �����ϴ�! �ٽ� �Է��ϼ���.");
			}
		}	
		sc.close();
	}
}
