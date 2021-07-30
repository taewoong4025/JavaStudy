package classPractice;

public class Book2 {
	String title;
	String author;
	
	public Book2() {
		this("",""); // 매개 변수 2개인 생성자 호출. 이구문은 항상 생성자 첫번째로 나와야함 아니면 컴파일 에러
		System.out.println("생성자 호출됨.");
	}
	
	public Book2(String t) {
		this(t,"작자미상");
		System.out.println("생성자 호출됨2");
	}
	
	public Book2(String t, String a) {
		this.title=t;
		this.author=a;
		System.out.println("생성자 호출됨3");
	}
	
	void show() {
		System.out.println("제목은 "+title+" 저자는 "+author);
	}
	
	public static void main(String[] args) {
		Book2 littlePrince = new Book2("어린왕자","생텍쥐페리");
		littlePrince.show();

		Book2 loveStory = new Book2("춘향전");
		loveStory.show();
		
		Book2 emptyBook = new Book2();
		emptyBook.show();
	}
}
