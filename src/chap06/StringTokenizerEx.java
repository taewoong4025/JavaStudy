package chap06;

import java.util.StringTokenizer;

public class StringTokenizerEx {
	public static void main(String[] args) {

		String query = "ȫ�浿/��ȭ/ȫ��/����/����";
		StringTokenizer st = new StringTokenizer(query,"/",false); // ���ڿ� , ������, �����ڸ� true���ϸ� ���� ��ū���� ���.

		while(st.hasMoreTokens()) { // ���� ��ū�� �ִٸ�
			System.out.println(st.nextToken()); // ���� ��ū ���
		}
	}
}
