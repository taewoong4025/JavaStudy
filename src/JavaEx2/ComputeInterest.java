package JavaEx2;

import java.util.Scanner;

public class ComputeInterest {
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int year=0; // ������
		int principal; // ����
		double rate; //������
		double balance=0; //������
		
		System.out.print("������ �Է��ϼ��� : ");
		principal=sc.nextInt();
		
		System.out.print("�������� �Է��ϼ��� : ");
		rate = sc.nextDouble();
		
		balance = principal;
		System.out.println("������\t������");
		while(true) {
			year++;
			balance = balance*(1.0+ rate/100.0);
			System.out.println(year +"\t"+balance);
			if(balance>principal*2.0) {
				break;
			}
		}
		System.out.println("�ʿ��� ������ = "+year);
		sc.close();
	 }
}
