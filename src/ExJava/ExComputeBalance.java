package ExJava;

import java.util.Scanner;

public class ExComputeBalance {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int balance; // û���ݾ�
		int purchaseAmount; // ���űݾ�
		
		System.out.print("���� �ݾ��� �Է��ϼ��� : ");
		purchaseAmount = sc.nextInt(); 
		
		if(purchaseAmount>=300000) {
			balance = purchaseAmount - 30000;
		}
		else if(purchaseAmount>=100000) {
			balance = purchaseAmount - 5000;
			
		}
		else {
			balance = purchaseAmount;
		}
		
		System.out.println("���� �ݾ� : "+purchaseAmount);
		System.out.print("û�� �ݾ� : "+balance);
		sc.close();
	}
}
