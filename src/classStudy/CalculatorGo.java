package classStudy;

import java.util.Scanner;

class Add{
	private int a;
	private int b;

	public void setValue(int a, int b) {
		this.a=a;
		this.b=b;

	}
	public int calculate() {
		return a+b;
	}
}

class Sub{
	private int a;
	private int b;

	public void setValue(int a, int b) {
		this.a=a;
		this.b=b;

	}
	public int calculate() {
		return a-b;
	}
}

class Mul{
	private int a;
	private int b;

	public void setValue(int a, int b) {
		this.a=a;
		this.b=b;

	}
	public int calculate() {
		return a*b;
	}
}

class Div{
	private int a;
	private int b;

	public void setValue(int a, int b) {
		this.a=a;
		this.b=b;

	}
	public int calculate() {
		int res=0;
		try {
			res=a/b;
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌수 없습니다.");
		}
		return res;
	}
}

public class CalculatorGo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("두 정수와 연산자를 입력하시오>>");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		String operator = sc.next();

		/* char c =sc.next().charAt(0); // 사칙연산 받을 거 // 스위치 문으로 오퍼레이터 받아서 출력
		 * 
		 * switch(operator) { case '+': Add add = new Add(); add.setValue(num1, num2);
		 * System.out.print(add.calculate()); break; }
		 */

		if(operator.equals("+")) {
			Add add = new Add();
			add.setValue(num1, num2);
			System.out.print(add.calculate());
		}
		if(operator.equals("-")) {
			Sub sub = new Sub();
			sub.setValue(num1, num2);
			System.out.print(sub.calculate());
		}
		if(operator.equals("*")) {
			Mul mul = new Mul();
			mul.setValue(num1, num2);
			System.out.print(mul.calculate());	
		}
		if(operator.equals("/")) {
			Div div = new Div();
			div.setValue(num1, num2);
			System.out.print(div.calculate());	
		}
		sc.close();		
	}
}
