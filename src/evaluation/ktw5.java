package evaluation;

public class ktw5 {

	public static void main(String[] args) {

		for (int i = 1; i < 100; i++) { //1~99���� �ݺ�
			int tenNumber=i/10; // i�� 10���ڸ� �� ����.
			int oneNumber=i%10; // i�� 1���ڸ� �� ����.

			if(tenNumber==3 || tenNumber==6 || tenNumber==9) { //10���ڸ����� 3 6 9 �̰�, 
				if(oneNumber==3 || oneNumber==6 || oneNumber==9) { // 1���ڸ����� 3 6 9 �̸� �ڼ��ι� ex)33 36 39
					System.out.println(i+" �ڼ��ι�");
				}
				else { // 10�� �ڸ��� 3,6,9 �� ���
					System.out.println(i+" �ڼ��ѹ�");
				}
			}

			else if(oneNumber==3 || oneNumber==6 || oneNumber==9){ // ���� �ڸ� ���ڰ� 3 6 9�� ���.
				System.out.println(i+" �ڼ��ѹ�");
			}
		}
	}
}
