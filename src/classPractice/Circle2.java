package classPractice;

import java.util.Scanner;

public class Circle2 {
	int radius;
	String name;
	
	public Circle2(){ //�����ڴ� Ŭ������ �����ÿ� �� �ѹ��� ȣ��Ǹ�, ��ü�� �ʱ�ȭ�� ����ϰ� �ȴ�. 
//						 �����ڴ� ��ȯŸ���� ����. Ŭ���� �̸��� �ݵ�� ���ƾ� ��.
		radius=1;    
		name="";
	}
	
	public Circle2(int r,String n){ 
		radius=r;
		name=n;
	}
	
	public double getArea() { // �޽��� ��ȯ Ÿ���� �ִ�.
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Circle2 donut = new Circle2();
		Circle2 pizza = new Circle2(10, "�ڹ�����");
		
		donut.name="���� ����";
		double area = donut.getArea();
		
		System.out.println(pizza.name+area);
		
		sc.close();
	}
}
