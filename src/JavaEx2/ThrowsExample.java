package JavaEx2;

public class ThrowsExample {
	public static void main(String[] args) {
		try {
			findclass();
		} catch (ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}
	}
	 
	public static void findclass() throws ClassNotFoundException {
	Class c1 = Class.forName("java.lang.String2");
	}
}
