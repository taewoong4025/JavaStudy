package JavaEx2;

import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numberToGuess; //���߱� ���� ����
		int guess;// ����ڰ� ������ ����

		numberToGuess=(int) (Math.random()*10+1); // 1~10������ ������ ����

		while(true) {
			System.out.print("������ ���ڸ� �Է��ϼ���>>");
			guess=sc.nextInt();
			if(guess > numberToGuess) {
				System.out.println("������ ���ڰ� �ʹ� Ů�ϴ�.");
			}
			else if(guess < numberToGuess){
				System.out.println("������ ���ڰ� �ʹ� �۽��ϴ�.");
			}else {
				System.out.println("���߼̽��ϴ�.");
				break;
			}
		}
		sc.close();
	}
}
