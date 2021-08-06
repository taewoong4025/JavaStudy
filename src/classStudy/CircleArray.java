package classStudy;

class Circle3{
	int radius;
	
	public Circle3(int radius) {
		this.radius=radius;
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
}
public class CircleArray {
	public static void main(String[] args) {
		Circle3[] c = new Circle3[5]; // 객체 배열은 단독으로 안됨. 참조변수에 넣어줘야함.
		
		for (int i = 0; i < c.length; i++) {
			c[i]= new Circle3(i);
			System.out.println(c[i].getArea());
		}
	}

}
