/**
 * ���� �Ұ�
 * 10������ 2������ ��ȯ�Ͻÿ�.
 */
package AlgorithmPractice;

import java.util.Scanner;

public class Base4 {
	public static void main(String[] args) {
		final int two=2;
		int decimal;
		int[] arr = new int[100];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("10���� ���ڸ� �Է��ϼ���>>");
		decimal=sc.nextInt();
		
		int i=0;
		int quotient = decimal; // ��
			
		while(quotient>0) {
			arr[i]=quotient%two; // 19%2 = 1
			quotient/=two; // 19/2 = 9
				i++;		
		}
		i--;
		for ( ; i >= 0; i--) {
			System.out.print(arr[i]+" ");
			sc.close();
		}
	}
}
