package classPractice;

import java.util.Scanner;

public class Rectangle {
	
	int width; //�ʺ�
	int height; //����
	
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
		
		System.out.println("�簢���� ����:"+area);
		sc.close();
	}
}
