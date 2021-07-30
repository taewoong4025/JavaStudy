package classPractice;

public class Book {
	private String title;
	private String author;
	
	public Book(String t){ //제목만 받는 생성자
		this.title=t;
		this.author="작자미상";
	}
	
	public Book(String t, String a){// 제목과 작자 까지 다 받은 생성자
		this.title=t;
		this.author=a;
	}

	public static void main(String[] args) {
		Book littlePrince = new Book("어린왕자","생텍쥐페리");
		
		System.out.println(littlePrince.title + " " + littlePrince.author);
		
		Book loveStory = new Book("춘향전");
		System.out.println(loveStory.title);
		
	}
}
