package classPractice;

import java.util.Scanner;

class Book3{
	String title; //����
	String author; //����
	
	public Book3(String title , String author) { //������
		this.title=title;
		this.author=author;		
	}
	
}

public class BookArray {
	public static void main(String[] args) {
		
		Book3[] book = new Book3[2];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < book.length; i++) { //2�� �ݺ�
			System.out.print("����>>");
			String title = sc.nextLine();
			System.out.print("����>>");
			String author= sc.nextLine();
			book[i] = new Book3(title, author); // ���� ���� �Է¹޾Ƽ�, book[0]�� ����.
			
		}
		sc.close();
	}
	
}
