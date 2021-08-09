package chap06;

class Point{
	private int x,y;
	
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
}

public class ObjectPropertyEx {
	public static void print(Object obj) {
		System.out.println(obj.getClass().getName());
		System.out.println(obj.hashCode()); //해쉬 코드와 객체 주소는 다름.
		System.out.println(obj); // 기본적으로 toString 붙음.
		System.out.println(obj.toString());
	}
	public static void main(String[] args) {
		Point p = new Point(2,3);
		
		print(p);
	}
}
