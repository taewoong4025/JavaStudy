package JavaEx2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0,n=0;
		System.out.println("���� 3���� �Է��ϼ���.");
		
		
		for (int i = 0; i < 3; i++) {
			System.out.print(i+1+"��° ��>>");
			try {
				n=sc.nextInt();
				//sum+=n;
				
			} catch (InputMismatchException e) {
				System.out.println("������ �ƴմϴ�. �ٽ� �Է��ϼ���.");
				sc.next();
//				n=0; //���ڸ� �־��� �� �տ� n ���� ���������Ƿ� 0���� �ʱ�ȭ �غ�.
				i--;
				continue; 
			}
			sum+=n;
		}
		System.out.println("���� :"+sum);
		
		sc.close();
	}
}
