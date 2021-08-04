package InheritancePractice;

class Point{
	private int x,y;
	public void set(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public void showPoint() {
		System.out.println("("+x+","+y+")");
	}
}

class ColorPoint extends Point{
	private String color;
	public void setColor(String color) {
		this.color=color;
	}
	
	public void showColorPoint() {
		System.out.println("색상은" + color + "입니다.");
		showPoint();
	}
	
}
public class ColorPointEx {
	public static void main(String[] args) {
		Point point = new Point();
		ColorPoint colorpoint = new ColorPoint();
		
		point.set(1, 2);
		point.showPoint();
		colorpoint.set(3, 4);
		colorpoint.setColor("빨강");
		colorpoint.showColorPoint();
		
	}
}
