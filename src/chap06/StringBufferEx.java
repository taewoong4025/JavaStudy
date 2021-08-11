package chap06;

public class StringBufferEx {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb);
		
		sb.append(" is pencil."); // 덧붙이기
		System.out.println(sb);
		
		sb.insert(7," my"); // 삽입
		System.out.println(sb);
		
		sb.replace(8, 10,"your"); //교체
		System.out.println(sb);
		
		sb.delete(8, 13); //삭제
		System.out.println(sb);
		
		sb.setLength(4); //길이 재설정
		System.out.println(sb);
	}
}
