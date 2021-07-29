package JAVA_7_28;

//import java.util.Arrays;
import java.util.Scanner;

public class ExArrayTest728 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int intArray[] = new int [5];
		int max=0;
		System.out.println("양수 5개를 입력하세요."); 
		
		for(int i = 0; i<intArray.length; i++) { //정수 입력 받음.
			intArray[i]=sc.nextInt();
			if(max<intArray[i]) {
				max=intArray[i];
			}
		}
		
		System.out.println("가장 큰 수는"+max+"입니다.");
		sc.close();
		
	}
}
