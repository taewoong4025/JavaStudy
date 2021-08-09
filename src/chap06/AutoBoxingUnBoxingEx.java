/**
 * 1.5버전 부터는 자동 박싱과 자동 언박싱
 */
package chap06;

public class AutoBoxingUnBoxingEx {
	public static void main(String[] args) {
		int n=10;
//		Integer intObject = Integer.valueOf(n);
		Integer intObject = n; //박싱
		
		System.out.println("intObject = "+intObject); //intObject = 10
		
//		int m = intObject.intValue() + 10; //언박싱
//		System.out.println("m = "+m);
		
		int m = intObject + 30; //언박싱
		System.out.println("m = "+m);

	}
}
