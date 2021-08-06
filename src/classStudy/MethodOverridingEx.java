package classStudy;


class Shape{
	public void draw() {
		System.out.println("Shape");	
	}
}

class Line extends Shape{
	@Override
	public void draw() {
		System.out.println("Line");
	}	
}
class Rect extends Shape{
	@Override
	public void draw() {
		System.out.println("Rect");	
	}

}
class Circle10 extends Shape{
	@Override
	public void draw() {
		System.out.println("Circle10");	
	}
	
}
public class MethodOverridingEx {
	static void paint(Shape p) { // Shape p = new Line();
		p.draw();
	}
	
	public static void main(String[] args) {
		Line line = new Line();
		
		paint(line); //line이 들어 갔기 때문에.
		paint(new Shape());
		paint(new Line());
	}

}
