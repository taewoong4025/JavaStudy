/**
 * �ڹ� �迭 ����
 * 	������ �迭 �����ϴ� �޼ҵ带 �����.
 * 
 */
package JavaEx2;

public class ArrayMake {
	
	 static int[] makeArray() {	// ������ �迭 �����ϴ� �޼ҵ� ����
		int temp[] = new int[10]; // �迭 �����ϰ�
		for (int i = 0; i < temp.length; i++) { // 1~10���� �ʱ�ȭ
			temp[i]=i+1;
		}
		return temp; // �迭����
	}
	
	public static void main(String[] args) {
		
		int intArray[]; //�迭 ���۷��� ���� ����.
		intArray = makeArray(); //�޼ҵ带 ȣ���ϰ� �޼ҵ尡 ������ �迭�� ���� �޴´�.
		
		for (int i = 0; i < intArray.length; i++) {
			
			System.out.println(intArray[i]+100);
		}
	
	
	}
}
