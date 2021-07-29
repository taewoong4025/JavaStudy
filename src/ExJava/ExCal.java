package ExJava;

import java.util.Scanner;

public class ExCal {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String c;
		
		System.out.println("두수 입력>>");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.print("연산자 입력>>");
		c=sc.next();
		
		if(c.equals("+")) {
			System.out.println("연산>>"+ num1 + " + " + num2);
			System.out.println(num1+"+"+num2+"의 계산 결과는 "+(num1+num2));
		}
		else if(c.equals("-")) {
			System.out.println("연산>>"+ num1 + " - " + num2);
			System.out.println(num1+"-"+num2+"의 계산 결과는 "+(num1-num2));
		}
		else if(c.equals("*")) {
			System.out.println("연산>>"+ num1 + " * " + num2);
			System.out.println(num1+"*"+num2+"의 계산 결과는 "+(num1*num2));
		}
		else if(c.equals("/")) {
			if(num2 != 0) {
			System.out.println("연산>>"+ num1 + " / " + num2);
			System.out.println(num1+"/"+num2+"의 계산 결과는 "+(num1/num2));
			}
			else {
				System.out.println("0으로 나눌 수 없습니다.");

			}
			
		}
		sc.close();
	}
}
