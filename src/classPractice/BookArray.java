package classPractice;

import java.util.Scanner;

class Book3{
	String title; //제목
	String author; //저자
	
	public Book3(String title , String author) { //생성자
		this.title=title;
		this.author=author;		
	}
	
}

public class BookArray {
	public static void main(String[] args) {
		
		Book3[] book = new Book3[2];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < book.length; i++) { //2번 반복
			System.out.print("제목>>");
			String title = sc.nextLine();
			System.out.print("저자>>");
			String author= sc.nextLine();
			book[i] = new Book3(title, author); // 제목 저자 입력받아서, book[0]에 저장.
			
		}
		sc.close();
	}
	
}
