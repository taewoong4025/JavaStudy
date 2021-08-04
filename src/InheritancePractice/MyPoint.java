package InheritancePractice;

public class MyPoint {

	private int x,y;

	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point(" + x + "," + y + ")";
	}

	public static void main(String[] args) {
		MyPoint p = new MyPoint(3,50);
		MyPoint q = new MyPoint(4,50);
		System.out.println(p);
		if(p.equals(q)) { // equals�� �� ������ ��ü�񱳱� ������ �ٸ���. 
			System.out.println("���� ��");
		}
		else {
			System.out.println("�ٸ� ��");
		}
	}
}
