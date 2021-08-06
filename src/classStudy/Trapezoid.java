package classStudy;

import java.util.Scanner;

public class Trapezoid {
	private double down;
	private double up;
	private double height;
	
	public void getArea() {
		System.out.print("사다리꼴의 면적은 "+(up+down)*height/2);
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Trapezoid t = new Trapezoid();
		
		System.out.print(">>");
		t.down=sc.nextDouble();
		t.up=sc.nextDouble();
		t.height=sc.nextDouble();
		
		t.getArea();
		
		sc.close();
	}
}
