package JavaEx1;

import java.util.Scanner;

public class Tesla {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dollar = 520;
		
		System.out.print("매수 수량을 입력하시오 >>");
		int number = sc.nextInt();
		
		int tesla=dollar * number;
		
		if(tesla%100==0) {
			System.out.println("100달러짜리 "+(tesla/100)+"매");
		}
		else {
			System.out.println("100달러짜리 "+(tesla/100)+"매");
			System.out.println("10달러짜리 "+((tesla%100)/10)+"매");
		}
		
		sc.close();
		
	}
}
