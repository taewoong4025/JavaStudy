package ExJava;

import java.util.Scanner;

public class ExCal {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String c;
		
		System.out.println("�μ� �Է�>>");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.print("������ �Է�>>");
		c=sc.next();
		
		if(c.equals("+")) {
			System.out.println("����>>"+ num1 + " + " + num2);
			System.out.println(num1+"+"+num2+"�� ��� ����� "+(num1+num2));
		}
		else if(c.equals("-")) {
			System.out.println("����>>"+ num1 + " - " + num2);
			System.out.println(num1+"-"+num2+"�� ��� ����� "+(num1-num2));
		}
		else if(c.equals("*")) {
			System.out.println("����>>"+ num1 + " * " + num2);
			System.out.println(num1+"*"+num2+"�� ��� ����� "+(num1*num2));
		}
		else if(c.equals("/")) {
			if(num2 != 0) {
			System.out.println("����>>"+ num1 + " / " + num2);
			System.out.println(num1+"/"+num2+"�� ��� ����� "+(num1/num2));
			}
			else {
				System.out.println("0���� ���� �� �����ϴ�.");

			}
			
		}
		sc.close();
	}
}
