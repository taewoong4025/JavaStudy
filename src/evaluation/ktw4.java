package evaluation;

import java.util.Scanner;

public class ktw4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text;
		String kor[]= {"���","�Ʊ�","��","�̷�","���"}; //�ѱ� ���� �迭
		String eng[]= {"love","baby","money","future","hope"}; //���� ���� �迭

		System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
		while(true) {
			System.out.print("�ѱ� �ܾ�?");
			text=sc.next(); // �ѱ� �ܾ �Է� ����.
			boolean flag = false; // �迭�� ��� �ѱ� �ܾ�� �ؽ�Ʈ�� ��ġ�ϴ��� üũ�ϴ� �뵵

			if(text.equals("�׸�")) { //�׸��̶�� Ÿ�����ϸ� ����.
				System.out.println("�˻��� �����մϴ�.");
				break;
			}
			else { //�ƴϸ� ��� ����
				for (int i = 0; i < kor.length; i++) { // �迭���� ��ŭ �ݺ��ؼ� 
					if(text.equals(kor[i])) { // �Է¹��� �ؽ�Ʈ�� �迭�� ��� �ѱ��� ������ 
						System.out.println(kor[i]+"�� "+eng[i]); // �ѱ۰� ���� ���.
						flag=true; //�÷��׸� true�� �ٲ�.
					}
				}
				if(!flag) { // flag==false ���� �Է¹��� �ܾ �迭�� ������.
					System.out.println(text+"��(��) ���� ������ �����ϴ�.");
				}
			}
		}
		sc.close();
	}
}
