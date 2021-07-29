package ExJava;

import java.util.Scanner;

public class ExSwitchECal {
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			int res = 0;
		
			System.out.println("연산>>");

			int op1=sc.nextInt();
			int op2=sc.nextInt();
			String op = sc.next();
			switch (op) {
				case "+":
					res=op1+op2;
					break;
				case "-":
					res=op1-op2;
					break;
				case "*":
					res=op1*op2;
					break;
				case "/":	
					if(op2==0) {
						System.out.println("0으로 나눌수 없습니다.");
						sc.close();
						return;
	
					}
					else {
						res=op1/op2;
					}
					break;

			}
			
			System.out.println("연산>>"+op1+op+op2);
			System.out.print(op1+op+op2+"의 계산 결과는 "+res);
			
			sc.close();
		}
}
