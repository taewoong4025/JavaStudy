package ExJava;

import java.util.Scanner;

public class ExThreeSixNine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("10~99 ������ ������ �Է��Ͻÿ�>>");
		int num = sc.nextInt();
		
		if(num>10) {
			if (num%10==3 || num%10==6 || num%10==9) {
				if(num/10==3 || num/10==6 || num/10==9) {
					System.out.println("�ڼ�¦¦");
				}else {
					System.out.println("�ڼ�¦");
				}
			}
			
		}
		else {
			System.out.println("10���� ū ���� �Է��ϼ���.");
		}
		sc.close();
	}
}


