package JavaEx2;

import java.util.Scanner;

public class ArrayMinMax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] intArray = new int[10];
		
		System.out.println("양수 10개를 입력하세요>>");
		for (int i = 0; i < intArray.length; i++) {
				intArray[i]=sc.nextInt();
		}
		
		int max = 0;
		int min = Integer.MAX_VALUE; // int형에서 가장 큰 수(2147..)
		
		for (int i = 0; i < intArray.length; i++) {
			
			if(max<intArray[i]) {
				max=intArray[i];
			}
			
			if(min>intArray[i]) {
				min=intArray[i];
			}
		}
		
//		Arrays.sort(intArray); //정렬을 이용한 최대 최소값.
//		
//		for (int i = 0; i < intArray.length; i++) {
//			min=intArray[0];
//			max=intArray[9];
//		}
		
		System.out.println("가장 작은 수는 "+min+"이고, 가장 큰 수는"+max+"이고, 최소값 + 최대값은"+(min+max)+"입니다.");
		
		sc.close();
	}
}
