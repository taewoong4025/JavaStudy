package JavaEx2;

import java.util.Scanner;

public class ArrayMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] intArray = new int[7];
	
		System.out.print("정수 7개를 입력하세요.");
		for (int i = 0; i < intArray.length; i++) {
				intArray[i]=sc.nextInt();	
		}
		
		int min=0;
		for (int i = 0; i < intArray.length; i++) {
			min=intArray[0];
			if(min>intArray[i]) {
				min=intArray[i];
			}
		}
		System.out.println("최소값은 "+min+"입니다.");

		sc.close();

	}
}
