package classPractice;

public class Book {
	private String title;
	private String author;
	
	public Book(String t){ //���� �޴� ������
		this.title=t;
		this.author="���ڹ̻�";
	}
	
	public Book(String t, String a){// ����� ���� ���� �� ���� ������
		this.title=t;
		this.author=a;
	}

	public static void main(String[] args) {
		Book littlePrince = new Book("�����","�������丮");
		
		System.out.println(littlePrince.title + " " + littlePrince.author);
		
		Book loveStory = new Book("������");
		System.out.println(loveStory.title);
		
	}
}
