package classStudy;

interface ShapeOne{
	final double PI = 3.14;
	void draw();
	double getArea();
	default public void redraw() {
		System.out.print("--- 다시 그립니다.");
		draw();
	}
}

class CircleOne implements ShapeOne {
	
	private int radius;

	public CircleOne(int radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("반지름이"+radius+"인 원입니다.");
	}

	@Override
	public double getArea() {
		return radius*radius*PI;
	}
}
class RectOne implements ShapeOne {
	
	private int width, height;
	
	public RectOne(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.println(width+"x"+height+"크기의 사각형 입니다.");
	}
	
	@Override
	public double getArea() {
		return height*width;
	}
}
class OvalOne implements ShapeOne {
	
	private int width,height;
	
	public OvalOne(int i, int j) {
		this.width=i;
		this.height=j;
	}

	@Override
	public void draw() {
		System.out.println(width+"x"+height+"에 내접하는 타원입니다.");
	}
	
	@Override
	public double getArea() {
		return width*height*PI;
	}
}

public class Shapes {
	public static void main(String[] args) {
		ShapeOne[] list = new ShapeOne[3];
		
		list[0]= new CircleOne(10);
		list[1]= new OvalOne(20,30);
		list[2]= new RectOne(10,40);
		
		for (int i = 0; i < list.length; i++) {
			list[i].redraw();
		}
		
		for (int i = 0; i < list.length; i++) {
			System.out.println("면적은 "+list[i].getArea());
		}
	}
}
