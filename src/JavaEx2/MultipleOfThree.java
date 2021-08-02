package JavaEx2;

import java.util.Scanner;

public class MultipleOfThree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int intArray[] = new int[10];
		
		System.out.print("양의 정수 10개를 입력하시오>>");
		
		for (int i = 0; i < intArray.length; i++) { // 정수 입력 받기.
			intArray[i]=sc.nextInt();
		}
		System.out.print("3의 배수는");
		for (int i = 0; i < intArray.length; i++) { // 정수 입력 받기.
			if(intArray[i]%3==0) {
				System.out.print(intArray[i]+" ");
			}
		}
	
		sc.close();
		
	}

}
