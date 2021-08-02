package JavaEx2;

import java.util.Scanner;

public class RandomNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int rNumber;			 
		int count=0;
		while(true) {
			rNumber = (int) (Math.random()*10+1);

			count++;	
			System.out.print(rNumber+" ");
			System.out.println(count);
			if(rNumber==7) {
				break;
			}
		}
		System.out.println(count+"번 만에 7이 나왔습니다.");
		sc.close(); 
	}
}
