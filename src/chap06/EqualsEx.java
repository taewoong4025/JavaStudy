package chap06;

class Point3{
	int x,y;

	public Point3(int x, int y) {
		this.x=x;
		this.y=y;
	}
	@Override
	public boolean equals(Object obj) { //��ü�� ���� ���ϱ� ���� Override
		// Object obj = new Point3(2,3); // ��ĳ���� ����
		Point3 p = (Point3)obj; //�ٿ� ĳ����
		if(x==p.x && y==p.y) { // ����.
			return true;
		}
		else {
			return false;
		}
	}
}
public class EqualsEx {

	public static void main(String[] args) {
		Point3 a = new Point3(2,3);
		Point3 b = new Point3(2,3);
		Point3 c = new Point3(3,4);

		if(a==b) {
			System.out.println("a==b");
		}
		else {
			System.out.println("a!=b");
		}

		if(a.equals(b)) { //a is not equal to b => �������̵� �� ��, ��ü���� ���� ���߱� ������ true
			System.out.println("a is equal to b");
		}
		else {
			System.out.println("a is not equal to b");
		}

		if(a.equals(c)) { // ���� ���ߴµ�, (2,3)�� (3,4)�̹Ƿ� false
			System.out.println("a is equal to c");
		}
		else {
			System.out.println("a is not equal to c");
		}
	}
}
