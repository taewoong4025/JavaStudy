package classStudy;

import java.util.Scanner;

public class PersonDriver {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String fname = null; //이름
		String lname = null; //성
		
		Person p1 = new Person();
		
		System.out.print("성을 입력하세요 : ");
		lname=sc.next();
		
		System.out.print("이름을 입력하세요 : ");
		fname=sc.next();
		
		p1.firstName=fname;
		p1.lastName=lname;
		
		System.out.println("성명의 길이 :"+p1.getLength());
		
		Person p2 = new Person();
			
		System.out.print("성을 입력하세요 : ");
		lname=sc.next();
		
		System.out.print("이름을 입력하세요 : ");
		fname=sc.next();
		
		p2.firstName=fname;
		p2.lastName=lname;
		
		System.out.println("성명의 길이 :"+p2.getLength());
		
		sc.close();
	}

}
