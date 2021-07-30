package classPractice;

import java.util.Scanner;

public class Circle2 {
	int radius;
	String name;
	
	public Circle2(){ //생성자는 클래스의 생성시에 단 한번만 호출되며, 객체의 초기화를 담당하게 된다. 
//						 생성자는 반환타입이 없음. 클래스 이름과 반드시 같아야 함.
		radius=1;    
		name="";
	}
	
	public Circle2(int r,String n){ 
		radius=r;
		name=n;
	}
	
	public double getArea() { // 메쏘드는 반환 타입이 있다.
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Circle2 donut = new Circle2();
		Circle2 pizza = new Circle2(10, "자바피자");
		
		donut.name="도넛 피자";
		double area = donut.getArea();
		
		System.out.println(pizza.name+area);
		
		sc.close();
	}
}
