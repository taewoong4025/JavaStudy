package JavaEx2;

import java.util.Scanner;


public class PrintAlphabet {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ĺ��� �Է��ϼ���>>");
			char c = sc.next().charAt(0);
			
			for (char i = c; i >='a'; i--) {
				for(char j = 'a'; j<=i; j++ ) {
					System.out.print(j);
				}
				System.out.println();
			}
			sc.close();
	}
}

