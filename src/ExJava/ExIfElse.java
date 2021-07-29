package ExJava;

import java.util.Scanner;

public class ExIfElse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int score;
		int year;
		
		System.out.print("점수를 입력하세요(0~100):");		
		score=sc.nextInt();
		System.out.print("학년을 입력하세요(1~4):");
		year=sc.nextInt();
		
		if(score>=60 && year<4) {
			System.out.println("합격입니다.");

		}else if(score>=70 && year==4) {
			System.out.println("합격입니다.");
		}
		else {
			System.out.println("불합격입니다.");
		}
	
		sc.close();
	}
	

}
