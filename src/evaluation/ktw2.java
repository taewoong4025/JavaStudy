package evaluation;

import java.util.Scanner;

public class ktw2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		String password="myongji60";
		int trynumber=0;
	
		while(true) {
			
			System.out.print("암호를 입력하세요: ");
			String input = sc.next();
			
			if(input.equals(password)) {
				System.out.println("환영합니다.");
				break;
			}
			else {
				System.out.println("암호가 틀렸습니다.");
				trynumber++;

			}
			
			if(trynumber == 3) {
				System.out.println("접속을 거부합니다.");
				break;
			}
		}
		sc.close();
	}
}


