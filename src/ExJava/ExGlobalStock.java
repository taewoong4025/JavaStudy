package ExJava;

import java.util.Scanner;

public class ExGlobalStock {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int purchaseAmount; // 매수금액
		int saleAmount; // 매도금액
		double transferTax; //양도세
		
		System.out.print("매수금액을 입력하세요: ");
		purchaseAmount=sc.nextInt();
		System.out.print("매도금액을 입력하세요: ");
		saleAmount=sc.nextInt();
		
		if(saleAmount>purchaseAmount) {
			transferTax = (saleAmount - purchaseAmount)*0.22; 
		}
		else {
			transferTax = 0;
		}
		
		System.out.println("양도세 = "+transferTax);
		sc.close();
	}
}

