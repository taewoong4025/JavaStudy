package JAVA_7_28;

//import java.util.Arrays;
import java.util.Scanner;

public class ExArrayTest728 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int intArray[] = new int [5];
		int max=0;
		System.out.println("��� 5���� �Է��ϼ���."); 
		
		for(int i = 0; i<intArray.length; i++) { //���� �Է� ����.
			intArray[i]=sc.nextInt();
			if(max<intArray[i]) {
				max=intArray[i];
			}
		}
		
		System.out.println("���� ū ����"+max+"�Դϴ�.");
		sc.close();
		
	}
}
