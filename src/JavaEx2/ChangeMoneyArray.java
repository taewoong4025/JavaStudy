package JavaEx2;

import java.util.Scanner;

public class ChangeMoneyArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] unit = {50000,10000,1000,500,100,50,10,1};
		 
		System.out.print("�ݾ��� �Է��Ͻÿ�>>");
		int money=sc.nextInt();
		
		for (int i = 0; i < unit.length; i++) {
			int res = money/unit[i];
			
			if(res>0) {
				
				System.out.println(unit[i]+"�� ¥��"+res+"��");
				money%=unit[i];
			}			
		}
		
		sc.close();
	}
}
