/**
 * 1.5���� ���ʹ� �ڵ� �ڽ̰� �ڵ� ��ڽ�
 */
package chap06;

public class AutoBoxingUnBoxingEx {
	public static void main(String[] args) {
		int n=10;
//		Integer intObject = Integer.valueOf(n);
		Integer intObject = n; //�ڽ�
		
		System.out.println("intObject = "+intObject); //intObject = 10
		
//		int m = intObject.intValue() + 10; //��ڽ�
//		System.out.println("m = "+m);
		
		int m = intObject + 30; //��ڽ�
		System.out.println("m = "+m);

	}
}
