package JavaEx1;

import java.util.Scanner;

public class Calc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		final int fiveTenThousand=50000; // 5����
		final int tenThousand=10000; // ����
		final int thousand=1000; // õ��
		final int hundred=100; // ���
		final int fifty=50; // ���ʿ�
		final int ten=10; // �ʿ�
		final int one=1; // �Ͽ�
		int res=0;
		
		System.out.print("�ݾ��� �Է��Ͻÿ�>>");
		int money = sc.nextInt();
		res=money/fiveTenThousand;
		money=money%fiveTenThousand;

		if(res>0) {
			System.out.println("�������� "+res+"��");
		}
		res=money/tenThousand;
		money=money%tenThousand;
		if(res>0) {
			System.out.println("������ "+res+"��");
		}	
		res=money/thousand;
		money=money%thousand;
		if(res>0) {
			System.out.println("õ���� "+res+"��");
		}
		res=money/hundred;
		money=money%hundred;
		if(res>0) {
			System.out.println("��� "+res+"��");
		}
		res=money/fifty;
		money=money%fifty;
		if(res>0) {
			System.out.println("���ʿ� "+res+"��");
		}
		res=money/ten;
		money=money%ten;
		if(res>0) {
			System.out.println("�ʿ� "+res+"��");
		}	
		res=money/one;
		money=money%one;
		if(res>0) {
			System.out.println("�Ͽ� "+res+"��");
		}

		sc.close();
	}
}
