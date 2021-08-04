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
		if(p.equals(q)) { // equals는 값 비교지만 객체비교기 때문에 다른점. 
			System.out.println("같은 점");
		}
		else {
			System.out.println("다른 점");
		}
	}
}
