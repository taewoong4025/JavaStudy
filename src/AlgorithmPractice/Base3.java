/**
 * ���� �Ұ�
 * ���� ���� ������ ���� ����Ͻÿ�.(�ֺ��)
 */

package AlgorithmPractice;

import java.util.Scanner;

public class Base3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		int mode[]=new int[10];
		
		// index -> ������ ��
		// index �� -> index(������ ��)�� ��� ���Դ��� �����ϴ� �뵵
		// mode[3] = 5 -> "3�����ڰ�, 5�� �����ߴ�."
	
		for (int i = 0; i < arr.length; i++) {
			mode[arr[i]]++;
		}
		
		int modeNum = 0; // �ֺ��
		int modeCnt = 0; // �ֺ���� ���� Ƚ��
		for (int i = 0; i < arr.length; i++) {
			if(modeCnt<mode[i]) {
				modeCnt=mode[i];
				modeNum=i;
				
			}
		}
		
		System.out.println("�ֺ�� = "+modeNum+" cnt : "+modeCnt);
		sc.close();
	}
}
