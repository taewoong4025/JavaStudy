package JavaEx2;

import java.util.Scanner;

public class NumException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] stringNumber = {"23","12","3.141592","998"};
//		String[] stringNumber = {"23","12","998"};
		
		int i=0;
		try {
			for (i = 0; i < stringNumber.length; i++) {
				int j = Integer.parseInt(stringNumber[i]);
				System.out.println("���ڷ� ��ȯ�� ���� "+j);
			}
			
		} catch (NumberFormatException e) {
			System.out.println(stringNumber[i]+"�� ������ ��ȯ�� �� �����ϴ�.");
			
		}
		
		sc.close();
	}
}
