package evaluation;

import java.util.Scanner;

public class ktw1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double volume;
		
		System.out.print("원뿔 밑의 원의 반지름을 입력하세요:");
		int radius = sc.nextInt();
		
		System.out.print("원뿔의 높이를 입력하세요:");
		int height = sc.nextInt();
		
		volume = (Math.PI*radius*radius*height)/3;// 1/3*pi*r*r*h;
		
		System.out.println("원뿔 밑의 원의 반지름 : "+(double)radius);
		System.out.println("원뿔의 높이 : "+(double)height);
		System.out.print("원뿔의 부피 : "+ volume);
		
		sc.close();
	}

}
