/**
 *  ���׸� ��� ������ 2�� �پ���.
 */

package chap07;

public class BoxExample2 {
	public static void main(String[] args) {
		Box2<String> box2 = new Box2<String>();
		box2.set("Hello");
//		box2.set(10); // Ÿ�԰˻�. String Ÿ���ε� int Ÿ���� ���� ������.
//		box2.set(new Integer(10)); // 
		String greet = box2.get();
		System.out.println(greet);
		
		Box2<Integer> box3 = new Box2<Integer>(); // Integet Ÿ������ ����
		box3.set(7);
		int value = box3.get();
		System.out.println(value);
		
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		
		if(i1.equals(i2)) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
	}
}
