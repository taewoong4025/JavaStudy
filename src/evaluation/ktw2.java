package evaluation;

import java.util.Scanner;

public class ktw2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		String password="myongji60";
		int trynumber=0;
	
		while(true) {
			
			System.out.print("��ȣ�� �Է��ϼ���: ");
			String input = sc.next();
			
			if(input.equals(password)) {
				System.out.println("ȯ���մϴ�.");
				break;
			}
			else {
				System.out.println("��ȣ�� Ʋ�Ƚ��ϴ�.");
				trynumber++;

			}
			
			if(trynumber == 3) {
				System.out.println("������ �ź��մϴ�.");
				break;
			}
		}
		sc.close();
	}
}


