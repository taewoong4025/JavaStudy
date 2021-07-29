package JAVA_7_28;

import java.util.Scanner;

public class EmergencyDisasterSubsidy728 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int hundred = 120000;
		final int ten = 12000;
		int money,res;	
		
		System.out.print("가구수를 입력하시오 >>");
		int fam = sc.nextInt();
		
		if(fam == 1) {
			money = 400000;
		}
		else if(fam == 2) {
			money = 600000;
		}
		else if(fam == 3) {
			money = 800000;
		}
		else{
			money = 1000000;
		}
		
		res=money/hundred;
		money=money%hundred;
		
		if(res>0) {
			System.out.println("100달러 짜리 " +res+"매");
		}
		
		res=money/ten;
		
		if(res>0) {
			System.out.println("10달러 짜리 " +res+"매");
		}
		
		sc.close();
	}
}
