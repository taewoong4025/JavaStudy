/**
 * �߻�Ŭ������ ��ü ������ �ȵȴ�.
 * �������̽��� ���� ��Ӱ���.
 * �������̽��� ��ü �迭���·� ��������.
 */
package AbstractStudy;

public class AnimalMain {
	public static void main(String[] args) {
//		Animal a = new Animal();
//		Bird b = new Bird();
		Penguin p = new Penguin();
		p.swim();
		Bird p2 = new Penguin(); // �� ĳ����
		p2.walk();
		Penguin p3=(Penguin) p2; // �ٿ� ĳ����
		
		p3.swim();
		
		Bird d2 = new Duck(); // �� ĳ���� ( ���� Ŭ���� ����� ���ٰ���)
		d2.walk();
		d2.eat();

		Duck d3 = (Duck)d2; //�ٿ� ĳ����
		d3.fly();
		d3.walk();
		d3.eat();
		d3.swim();
				
	Swim2[] s = new Swim2[2]; //��ü�迭 ���·� ��������.
		s[0] = new Penguin();
		s[1] = new Duck();
	
		s[0].swim();
	}
}
