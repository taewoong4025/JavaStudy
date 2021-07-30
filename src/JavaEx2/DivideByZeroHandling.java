package JavaEx2;

import java.util.Scanner;

public class DivideByZeroHandling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dividend; // 분자
		int divisor; // 분모
		
		while (true) {
			System.out.print("분자를 입력하시오>>");
			dividend = sc.nextInt();

			System.out.print("분모를 입력하시오>>");
			divisor = sc.nextInt();

			try {
				System.out.println(dividend+"를"+divisor+"로 나누면 몫은"+dividend/divisor+"입니다.");
				break;
			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다! 다시 입력하세요.");
			}
		}	
		sc.close();
	}
}
