package JavaEx1;

import java.util.Scanner;

public class Tesla {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dollar = 520;
		
		System.out.print("�ż� ������ �Է��Ͻÿ� >>");
		int number = sc.nextInt();
		
		int tesla=dollar * number;
		
		if(tesla%100==0) {
			System.out.println("100�޷�¥�� "+(tesla/100)+"��");
		}
		else {
			System.out.println("100�޷�¥�� "+(tesla/100)+"��");
			System.out.println("10�޷�¥�� "+((tesla%100)/10)+"��");
		}
		
		sc.close();
		
	}
}
