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
		return "Circle("+x+","+y+") 반지름"+radius;
	}

	@Override
	public boolean equals(Object obj) {
		// Object obj = new CircleEquals(2,3,30); // 업캐스팅 선행
		CircleEquals b = (CircleEquals)obj; //다운 캐스팅
		
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
		
		System.out.println("원 a: "+ a);
		System.out.println("원 b: "+ b);
		
		if(a.equals(b)) {
			System.out.println("같은 원");
		}
		else {
			System.out.println("서로 다른 원");
		}
		
	}
}
