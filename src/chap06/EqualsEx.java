package chap06;

class Point3{
	int x,y;

	public Point3(int x, int y) {
		this.x=x;
		this.y=y;
	}
	@Override
	public boolean equals(Object obj) { //객체의 값을 비교하기 위한 Override
		// Object obj = new Point3(2,3); // 업캐스팅 선행
		Point3 p = (Point3)obj; //다운 캐스팅
		if(x==p.x && y==p.y) { // 값비교.
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

		if(a.equals(b)) { //a is not equal to b => 오버라이딩 이 후, 객체들의 값을 비교했기 때문에 true
			System.out.println("a is equal to b");
		}
		else {
			System.out.println("a is not equal to b");
		}

		if(a.equals(c)) { // 값을 비교했는데, (2,3)과 (3,4)이므로 false
			System.out.println("a is equal to c");
		}
		else {
			System.out.println("a is not equal to c");
		}
	}
}
