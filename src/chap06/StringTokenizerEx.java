package chap06;

import java.util.StringTokenizer;

public class StringTokenizerEx {
	public static void main(String[] args) {

		String query = "홍길동/장화/홍련/콩쥐/팥쥐";
		StringTokenizer st = new StringTokenizer(query,"/",false); // 문자열 , 구분자, 구분자를 true로하면 같이 토큰으로 출력.

		while(st.hasMoreTokens()) { // 다음 토큰이 있다면
			System.out.println(st.nextToken()); // 다음 토큰 출력
		}
	}
}
