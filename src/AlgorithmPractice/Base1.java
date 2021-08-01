/**
 *  ���� �Ұ�
 *  �л��������� �����ϰ�, �л��̸����� �˻����� �� �й��� ����ϴ� ���α׷� ����.
 *  Student Ŭ���� ����
 *  String name, no�� ���� (�̸��� �й�)
 *  �л����� ArrayList�� ������ ����,
 *  ��� �˻��� �ϰڴ��� y-> �ݺ�
 *  �����ϰ������ n -> ���α׷� ����
 *  �л� �̸��� �ִ� ��� �� �л��� �й��� ���
 *  �л� �̸��� ������, ���� �л��̸��̶�� ���
 */

package AlgorithmPractice;

import java.util.ArrayList;
import java.util.Scanner;

class Student{
	private String name;
	private int no;
	
	public Student(String name, int no) {
		super();
		this.name = name;
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	
}

public class Base1 {
	public static void main(String[] args) {
		Student student1 = new Student("���¿�",1434303);
		Student student2 = new Student("���缺",1434512);		
		Student student3 = new Student("�����",1434834);
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(student1);
		list.add(student2);
		list.add(student3);
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("��� �˻��� �ϰ�����ø� y, �����ϰ������ n");
			String s = sc.next();
			
			if(s.equals("y")) {
				System.out.println("�˻��� �����մϴ�.");
				String name = sc.next();
				boolean flag = false;
				
				for(Student stu : list) { // 
					if(stu.getName().equals(name)) {
						System.out.println("�ش��ϴ� �л��� �й��� :"+stu.getNo());
						flag = true;
					}
				}	
				if(!flag) {
					System.out.println("�ش��ϴ� �л��̸��� �����ϴ�.");
				}
					
			}
			else if(s.equals("n")) {
				break;
			}
		}
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
		sc.close();
	}

}
