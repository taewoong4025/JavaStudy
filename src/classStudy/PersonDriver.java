package classStudy;

import java.util.Scanner;

public class PersonDriver {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String fname = null; //�̸�
		String lname = null; //��
		
		Person p1 = new Person();
		
		System.out.print("���� �Է��ϼ��� : ");
		lname=sc.next();
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		fname=sc.next();
		
		p1.firstName=fname;
		p1.lastName=lname;
		
		System.out.println("������ ���� :"+p1.getLength());
		
		Person p2 = new Person();
			
		System.out.print("���� �Է��ϼ��� : ");
		lname=sc.next();
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		fname=sc.next();
		
		p2.firstName=fname;
		p2.lastName=lname;
		
		System.out.println("������ ���� :"+p2.getLength());
		
		sc.close();
	}

}
