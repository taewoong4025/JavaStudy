package JavaEx2;

import java.util.Scanner;

public class ArrayMinMax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] intArray = new int[10];
		
		System.out.println("��� 10���� �Է��ϼ���>>");
		for (int i = 0; i < intArray.length; i++) {
				intArray[i]=sc.nextInt();
		}
		
		int max = 0;
		int min = Integer.MAX_VALUE; // int������ ���� ū ��(2147..)
		
		for (int i = 0; i < intArray.length; i++) {
			
			if(max<intArray[i]) {
				max=intArray[i];
			}
			
			if(min>intArray[i]) {
				min=intArray[i];
			}
		}
		
//		Arrays.sort(intArray); //������ �̿��� �ִ� �ּҰ�.
//		
//		for (int i = 0; i < intArray.length; i++) {
//			min=intArray[0];
//			max=intArray[9];
//		}
		
		System.out.println("���� ���� ���� "+min+"�̰�, ���� ū ����"+max+"�̰�, �ּҰ� + �ִ밪��"+(min+max)+"�Դϴ�.");
		
		sc.close();
	}
}
