package evaluation;

import java.util.Scanner;

public class ktw3 {
	public static void main(String[] args) {
		int intArray[][] = new int[3][4]; // 3*4�迭 ����.
		int sum=0; //�� ����.
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[i].length; j++) {
				int randomNum = (int) (Math.random()*10); //0 ~ 9���� ������ �������� ����.
				intArray[i][j]=randomNum; //0~9������ �迭�� ����.
			}
		}
		for (int i = 0; i < intArray.length; i++) { 
			for (int j = 0; j < intArray[i].length; j++) {
				System.out.print(intArray[i][j]+"\t"); //�迭�� ����� ���� ���.
				sum+=intArray[i][j]; // �������� sum�� �ϳ��� ����.
			}
			System.out.println();
		}
		System.out.print("���� "+sum);
		
		sc.close();
	}
}
