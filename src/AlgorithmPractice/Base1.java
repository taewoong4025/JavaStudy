/**
 *  문제 소개
 *  학생정보들을 저장하고, 학생이름으로 검색했을 때 학번을 출력하는 프로그램 생성.
 *  Student 클래스 생성
 *  String name, no를 가짐 (이름과 학번)
 *  학생들을 ArrayList에 저장한 이후,
 *  계속 검색을 하겠느냐 y-> 반복
 *  종료하고싶으면 n -> 프로그램 종료
 *  학생 이름이 있는 경우 그 학생의 학번을 출력
 *  학생 이름이 없으면, 없는 학생이름이라고 출력
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
		Student student1 = new Student("곽태웅",1434303);
		Student student2 = new Student("이재성",1434512);		
		Student student3 = new Student("신재승",1434834);
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(student1);
		list.add(student2);
		list.add(student3);
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("계속 검색을 하고싶으시면 y, 종료하고싶으면 n");
			String s = sc.next();
			
			if(s.equals("y")) {
				System.out.println("검색을 시작합니다.");
				String name = sc.next();
				boolean flag = false;
				
				for(Student stu : list) { // 
					if(stu.getName().equals(name)) {
						System.out.println("해당하는 학생의 학번은 :"+stu.getNo());
						flag = true;
					}
				}	
				if(!flag) {
					System.out.println("해당하는 학생이름이 없습니다.");
				}
					
			}
			else if(s.equals("n")) {
				break;
			}
		}
		System.out.println("프로그램이 종료되었습니다.");
		sc.close();
	}

}
