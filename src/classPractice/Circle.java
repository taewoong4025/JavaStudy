package classPractice;

public class Circle {
	int radius; // 반지름
	String name; // 이름
	
	public Circle() {		
	}

	public double getArea() {
		return 3.14 * radius*radius;
	}

	public static void main(String[] args) {
		Circle pizza = new Circle();
		pizza.radius=10;
		pizza.name="콤비네이션 피자";
		double area = pizza.getArea();
		System.out.println(pizza.name+" 면적은 " + area);
		
		Circle donut = new Circle();
		donut.radius=2;
		donut.name="크리스피 도넛";
		area = donut.getArea();
		}

}