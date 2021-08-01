/**
 * 문제 소개
 * 피보나치 수열을 출력해라
 * An = An-1 + An-2
 */

package AlgorithmPractice;

public class Base2 {
	public static void main(String[] args) {
		int arr[] = new int[100];
		
//		An = An-1 + An-2   n>=3
//		a1 = 1, a2 = 1 
		arr[1]=1;
		arr[2]=2;
		
		for (int i = 3; i < arr.length; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}

		for (int i = 1; i < 10; i++) {
			System.out.println(arr[i]);
		}
	}
}
