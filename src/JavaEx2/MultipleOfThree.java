package JavaEx2;

import java.util.Scanner;

public class MultipleOfThree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int intArray[] = new int[10];
		
		System.out.print("���� ���� 10���� �Է��Ͻÿ�>>");
		
		for (int i = 0; i < intArray.length; i++) { // ���� �Է� �ޱ�.
			intArray[i]=sc.nextInt();
		}
		System.out.print("3�� �����");
		for (int i = 0; i < intArray.length; i++) { // ���� �Է� �ޱ�.
			if(intArray[i]%3==0) {
				System.out.print(intArray[i]+" ");
			}
		}
	
		sc.close();
		
	}

}
