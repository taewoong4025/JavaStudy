package ExJava;

import java.util.Scanner;

public class ExThreeSixNine2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num,count=0;
		System.out.println("1~99사이의 정수를 입력하시오>>");
		num=sc.nextInt();
		
		int a,b;
		
		a=num/10; //몫
		b=num%10; //나머지
	
		if(a%3==0) {
			count++;
		}
		if(b%3==0 && b!=0) {
			count++;
		}
		
		if(count == 2) {
			System.out.println("박수짝짝");
		}else if(count == 1) {
			System.out.println("박수짝");
		}else {			
			System.out.println("박수없음");
		}
		
		sc.close();
	}
}
