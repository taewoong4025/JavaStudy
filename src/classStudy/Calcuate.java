package classStudy;

import java.util.Scanner;

abstract class Calc{
	abstract void setValue(int a, int b);
	abstract int calculate();
}

class AddOne extends Calc{
	private int a,b;

	@Override
	void setValue(int a, int b) {
		this.a=a;
		this.b=b;
	}

	@Override
	int calculate() {
		
		return a+b;
	}
	
}

class SubOne extends Calc{
	private int a,b;
	
	@Override
	void setValue(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	@Override
	int calculate() {
		
		return a-b;
	}
	
}

class MulOne extends Calc{
	private int a,b;
	
	@Override
	void setValue(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	@Override
	int calculate() {
		
		return a*b;
	}
	
}

class DivOne extends Calc{
	private int a,b;
	
	@Override
	void setValue(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	@Override
	int calculate() {
		int res=0;
		try {
			res=a/b;
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌수 없습니다.");
		}
		return res;
	}
}

public class Calcuate {
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
			AddOne add = new AddOne();
			add.setValue(num1, num2);
			System.out.print(add.calculate());
		}
		if(operator.equals("-")) {
			SubOne sub = new SubOne();
			sub.setValue(num1, num2);
			System.out.print(sub.calculate());
		}
		if(operator.equals("*")) {
			MulOne mul = new MulOne();
			mul.setValue(num1, num2);
			System.out.print(mul.calculate());	
		}
		if(operator.equals("/")) {
			DivOne div = new DivOne();
			div.setValue(num1, num2);
			System.out.print(div.calculate());	
		}
		sc.close();		
	}
}
