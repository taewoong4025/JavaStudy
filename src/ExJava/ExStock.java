package ExJava;

import java.util.Scanner;

public class ExStock {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ڽ��� ������ �Է��ϼ���(1800~2500)>>");
		int kospi = sc.nextInt();
		
		System.out.print("ȯ���� �Է��ϼ���(1100~1200)>>");
		int rate = sc.nextInt();
		
		if(kospi>=2300) {
			System.out.println("�����");
		}
		else if(kospi<2300 && kospi>=2000) {
			if(rate>=1150) {
				if(kospi>=2200) {
					System.out.println("�����");
				}
			}
			else {				
				System.out.println("Ⱦ����");					
			}
		}
		else {
			System.out.println("�϶���");
		}
			
		sc.close();
		
	}

}
