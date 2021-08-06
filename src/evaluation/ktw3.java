package evaluation;

import java.util.Scanner;

public class ktw3 {
	public static void main(String[] args) {
		int intArray[][] = new int[3][4]; // 3*4배열 생성.
		int sum=0; //합 저장.
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[i].length; j++) {
				int randomNum = (int) (Math.random()*10); //0 ~ 9까지 정수를 랜덤으로 생성.
				intArray[i][j]=randomNum; //0~9정수를 배열에 저장.
			}
		}
		for (int i = 0; i < intArray.length; i++) { 
			for (int j = 0; j < intArray[i].length; j++) {
				System.out.print(intArray[i][j]+"\t"); //배열에 저장된 정수 출력.
				sum+=intArray[i][j]; // 정수들을 sum에 하나씩 저장.
			}
			System.out.println();
		}
		System.out.print("합은 "+sum);
		
		sc.close();
	}
}
