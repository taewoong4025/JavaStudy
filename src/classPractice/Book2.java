package classPractice;

public class Book2 {
	String title;
	String author;
	
	public Book2() {
		this("",""); // �Ű� ���� 2���� ������ ȣ��. �̱����� �׻� ������ ù��°�� ���;��� �ƴϸ� ������ ����
		System.out.println("������ ȣ���.");
	}
	
	public Book2(String t) {
		this(t,"���ڹ̻�");
		System.out.println("������ ȣ���2");
	}
	
	public Book2(String t, String a) {
		this.title=t;
		this.author=a;
		System.out.println("������ ȣ���3");
	}
	
	void show() {
		System.out.println("������ "+title+" ���ڴ� "+author);
	}
	
	public static void main(String[] args) {
		Book2 littlePrince = new Book2("�����","�������丮");
		littlePrince.show();

		Book2 loveStory = new Book2("������");
		loveStory.show();
		
		Book2 emptyBook = new Book2();
		emptyBook.show();
	}
}
