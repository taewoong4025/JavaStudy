package ExJava;

import java.util.Scanner;

public class ExGlobalStock {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int purchaseAmount; // �ż��ݾ�
		int saleAmount; // �ŵ��ݾ�
		double transferTax; //�絵��
		
		System.out.print("�ż��ݾ��� �Է��ϼ���: ");
		purchaseAmount=sc.nextInt();
		System.out.print("�ŵ��ݾ��� �Է��ϼ���: ");
		saleAmount=sc.nextInt();
		
		if(saleAmount>purchaseAmount) {
			transferTax = (saleAmount - purchaseAmount)*0.22; 
		}
		else {
			transferTax = 0;
		}
		
		System.out.println("�絵�� = "+transferTax);
		sc.close();
	}
}

