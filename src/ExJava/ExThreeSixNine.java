package ExJava;

import java.util.Scanner;

public class ExThreeSixNine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("10~99 사이의 정수를 입력하시오>>");
		int num = sc.nextInt();
		
		if(num>10) {
			if (num%10==3 || num%10==6 || num%10==9) {
				if(num/10==3 || num/10==6 || num/10==9) {
					System.out.println("박수짝짝");
				}else {
					System.out.println("박수짝");
				}
			}
			
		}
		else {
			System.out.println("10보다 큰 수를 입력하세요.");
		}
		sc.close();
	}
}


