package JavaEx2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0,n=0;
		System.out.println("정수 3개를 입력하세요.");
		
		
		for (int i = 0; i < 3; i++) {
			System.out.print(i+1+"번째 수>>");
			try {
				n=sc.nextInt();
				//sum+=n;
				
			} catch (InputMismatchException e) {
				System.out.println("정수가 아닙니다. 다시 입력하세요.");
				sc.next();
//				n=0; //문자를 넣었을 때 앞에 n 값이 남아있으므로 0으로 초기화 해봄.
				i--;
				continue; 
			}
			sum+=n;
		}
		System.out.println("합은 :"+sum);
		
		sc.close();
	}
}
