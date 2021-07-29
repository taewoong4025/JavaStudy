package JAVA_7_28;

import java.util.Scanner;

public class ArrayLength728 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int intArray[] = new int[5];
		int sum=0;
		
		System.out.print(intArray.length+"개의 정수를 입력하세요>>");
		for(int i = 0; i<intArray.length; i++){
			intArray[i]=sc.nextInt();
			
			sum+=intArray[i];
		}
		System.out.println("평균은 "+sum/intArray.length+"입니다.");
		sc.close();
	}
}
