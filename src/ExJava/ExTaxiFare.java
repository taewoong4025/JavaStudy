package ExJava;

import java.util.Scanner;

public class ExTaxiFare {
	public static void main(String[] args) {
		
		int fare;
		int income=0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			System.out.print("����� �Է��ϼ���>>");
			fare = sc.nextInt();
			income += fare;
		}
		System.out.println("�� ���� :"+income);
		sc.close();
	}
}
