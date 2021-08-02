package JavaEx2;

import java.util.Scanner;

public class ComputeInterest {
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int year=0; // 연도수
		int principal; // 원금
		double rate; //연이율
		double balance=0; //원리금
		
		System.out.print("원금을 입력하세요 : ");
		principal=sc.nextInt();
		
		System.out.print("연이율을 입력하세요 : ");
		rate = sc.nextDouble();
		
		balance = principal;
		System.out.println("연도수\t원리금");
		while(true) {
			year++;
			balance = balance*(1.0+ rate/100.0);
			System.out.println(year +"\t"+balance);
			if(balance>principal*2.0) {
				break;
			}
		}
		System.out.println("필요한 연도수 = "+year);
		sc.close();
	 }
}
