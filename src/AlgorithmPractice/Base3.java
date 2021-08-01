/**
 * 문제 소개
 * 가장 많이 출현한 수를 출력하시오.(최빈수)
 */

package AlgorithmPractice;

import java.util.Scanner;

public class Base3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		int mode[]=new int[10];
		
		// index -> 출현한 수
		// index 값 -> index(출현한 수)가 몇번 나왔는지 저장하는 용도
		// mode[3] = 5 -> "3번숫자가, 5번 출현했다."
	
		for (int i = 0; i < arr.length; i++) {
			mode[arr[i]]++;
		}
		
		int modeNum = 0; // 최빈수
		int modeCnt = 0; // 최빈수가 나온 횟수
		for (int i = 0; i < arr.length; i++) {
			if(modeCnt<mode[i]) {
				modeCnt=mode[i];
				modeNum=i;
				
			}
		}
		
		System.out.println("최빈수 = "+modeNum+" cnt : "+modeCnt);
		sc.close();
	}
}
