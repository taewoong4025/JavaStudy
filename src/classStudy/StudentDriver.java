package classStudy;

public class StudentDriver {
	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.setName("갑돌");
		s1.setNubmer(100);
		s1.setDepartment("컴퓨터공학과");
		
		System.out.println(s1);
		
		s2.setName("갑순");
		s2.setNubmer(200);
		s2.setDepartment("건축공학과");
		System.out.println(s2);
		s2.setDepartment("수학과");
		System.out.println(s2);
	}
}
