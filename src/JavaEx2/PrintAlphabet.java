package JavaEx2;

import java.util.Scanner;

public class PrintAlphabet {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		char[] alphabet= new char[26];
		
		for (int i = 0; i < alphabet.length; i++) {
			
			alphabet[i] = (char)(97+i);
		}
		System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ�>>"); //���� �ʿ�
		char c = sc.next().charAt(0);
		for (int i = 0; i < alphabet.length; i++) {
			for(int j=0; j < 10; j++) {
				System.out.println(alphabet[i]);
				if(c==alphabet[i]) {
					break;
				}	
			}
		}
		sc.close();
	}
}


