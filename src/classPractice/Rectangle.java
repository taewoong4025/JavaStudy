package classPractice;

import java.util.Scanner;

public class Rectangle {
	
	int width; //너비
	int height; //높이
	
	public int getArea() {
		return width*height;
	}
	
	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle();
		
		Scanner sc = new Scanner(System.in);
		System.out.println(">>");
		
		r1.width=sc.nextInt();
		r1.height=sc.nextInt();
		int area = r1.getArea();
		
		System.out.println("사각형의 면적:"+area);
		sc.close();
	}
}
