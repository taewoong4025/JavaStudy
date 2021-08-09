package JavaEx2;

import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numberToGuess; //맞추기 위한 숫자
		int guess;// 사용자가 추측한 숫자

		numberToGuess=(int) (Math.random()*10+1); // 1~10사이의 임의의 정수

		while(true) {
			System.out.print("추측한 숫자를 입력하세요>>");
			guess=sc.nextInt();
			if(guess > numberToGuess) {
				System.out.println("추측한 숫자가 너무 큽니다.");
			}
			else if(guess < numberToGuess){
				System.out.println("추측한 숫자가 너무 작습니다.");
			}else {
				System.out.println("맞추셨습니다.");
				break;
			}
		}
		sc.close();
	}
}
