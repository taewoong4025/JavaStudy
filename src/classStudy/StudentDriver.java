package classStudy;

public class StudentDriver {
	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.setName("����");
		s1.setNubmer(100);
		s1.setDepartment("��ǻ�Ͱ��а�");
		
		System.out.println(s1);
		
		s2.setName("����");
		s2.setNubmer(200);
		s2.setDepartment("������а�");
		System.out.println(s2);
		s2.setDepartment("���а�");
		System.out.println(s2);
	}
}
