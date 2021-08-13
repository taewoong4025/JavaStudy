package classStudy;

class CircleEquals{
	int x;
	int y;
	int radius;
	
	public CircleEquals(int x, int y, int radius) {
		this.x=x;
		this.y=y;
		this.radius=radius;
	}

	@Override
	public String toString() {
		return "Circle("+x+","+y+") ������"+radius;
	}

	@Override
	public boolean equals(Object obj) {
		// Object obj = new CircleEquals(2,3,30); // ��ĳ���� ����
		CircleEquals b = (CircleEquals)obj; //�ٿ� ĳ����
		
		if(x==b.x && y==b.y) {
			return true;
		}
		else {
			return false;
		}
	}
}

public class CircleApp {
	public static void main(String[] args) {
		CircleEquals a = new CircleEquals(2, 3, 5);
		CircleEquals b = new CircleEquals(2, 3, 30);
		
		System.out.println("�� a: "+ a);
		System.out.println("�� b: "+ b);
		
		if(a.equals(b)) {
			System.out.println("���� ��");
		}
		else {
			System.out.println("���� �ٸ� ��");
		}
		
	}
}
