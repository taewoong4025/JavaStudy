package chap06;

class Point2{
	private int x,y;
	
	public Point2(int x, int y) {
		this.x=x;
		this.y=y;
	}
	@Override
	public String toString() { //�������̵��ؼ� 
		return "Point("+x+","+y+")";
	}
}

public class ToStringEx {
	public static void main(String[] args) {
		Point2 p = new Point2(2,3);
		
		System.out.println(p); // chap06.Point2@15db9742 => Point(2,3)
		System.out.println(p+"�Դϴ�."); 
		System.out.println(p.toString());
				
	}
}
