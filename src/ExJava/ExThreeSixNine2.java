package ExJava;

import java.util.Scanner;

public class ExThreeSixNine2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num,count=0;
		System.out.println("1~99������ ������ �Է��Ͻÿ�>>");
		num=sc.nextInt();
		
		int a,b;
		
		a=num/10; //��
		b=num%10; //������
	
		if(a%3==0) {
			count++;
		}
		if(b%3==0 && b!=0) {
			count++;
		}
		
		if(count == 2) {
			System.out.println("�ڼ�¦¦");
		}else if(count == 1) {
			System.out.println("�ڼ�¦");
		}else {			
			System.out.println("�ڼ�����");
		}
		
		sc.close();
	}
}
