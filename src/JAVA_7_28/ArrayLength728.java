package JAVA_7_28;

import java.util.Scanner;

public class ArrayLength728 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int intArray[] = new int[5];
		int sum=0;
		
		System.out.print(intArray.length+"���� ������ �Է��ϼ���>>");
		for(int i = 0; i<intArray.length; i++){
			intArray[i]=sc.nextInt();
			
			sum+=intArray[i];
		}
		System.out.println("����� "+sum/intArray.length+"�Դϴ�.");
		sc.close();
	}
}
