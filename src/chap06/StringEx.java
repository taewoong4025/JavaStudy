package chap06;

public class StringEx {
	public static void main(String[] args) {
		String a = new String(" C#");
		String b = new String(",C++ ");
		
		System.out.println(a+"�� ���̴� "+a.length());
		System.out.println(a.contains("#"));
		System.out.println(a.contains("*"));
		
		a = a.concat(b);
		System.out.println(a+"�� ���̴� "+a.length());
		
		a=a.trim();
		System.out.println(a+"�� ���̴� "+a.length());
		
		a=a.replace("C#", "Java");
		System.out.println(a+"�� ���̴� "+a.length());
		
		String s[] = a.split(",");
		System.out.println("���ڿ� ���̴� " +s.length );
		for (int i = 0; i < s.length; i++) {
			System.out.println("�и��� ���ڿ�"+i+":"+s[i]);
		}
		
		a=a.substring(5);
		
		System.out.println(a);
		
		char c = a.charAt(2);
		System.out.println(c);
	}
}
