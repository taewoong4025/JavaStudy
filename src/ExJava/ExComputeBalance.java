package ExJava;

import java.util.Scanner;

public class ExComputeBalance {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int balance; // 청구금액
		int purchaseAmount; // 구매금액
		
		System.out.print("구매 금액을 입력하세요 : ");
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
		
		System.out.println("구매 금액 : "+purchaseAmount);
		System.out.print("청구 금액 : "+balance);
		sc.close();
	}
}
