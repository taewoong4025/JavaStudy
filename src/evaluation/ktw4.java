package evaluation;

import java.util.Scanner;

public class ktw4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text;
		String kor[]= {"사랑","아기","돈","미래","희망"}; //한글 담은 배열
		String eng[]= {"love","baby","money","future","hope"}; //영어 담은 배열

		System.out.println("한영 단어 검색 프로그램입니다.");
		while(true) {
			System.out.print("한글 단어?");
			text=sc.next(); // 한글 단어를 입력 받음.
			boolean flag = false; // 배열에 담긴 한글 단어와 텍스트가 일치하는지 체크하는 용도

			if(text.equals("그만")) { //그만이라고 타이핑하면 종료.
				System.out.println("검색을 종료합니다.");
				break;
			}
			else { //아니면 계속 실행
				for (int i = 0; i < kor.length; i++) { // 배열길이 만큼 반복해서 
					if(text.equals(kor[i])) { // 입력받은 텍스트와 배열에 담긴 한글이 같으면 
						System.out.println(kor[i]+"는 "+eng[i]); // 한글과 영어 출력.
						flag=true; //플래그를 true로 바꿈.
					}
				}
				if(!flag) { // flag==false 만약 입력받은 단어가 배열에 없으면.
					System.out.println(text+"은(는) 저의 사전에 없습니다.");
				}
			}
		}
		sc.close();
	}
}
