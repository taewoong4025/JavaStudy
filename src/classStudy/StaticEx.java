package classStudy;

class ArrayUtil{
	public static int[] concat(int[] a , int[] b) {
//		int a1[] = a; // �Ű� ���� �迭 a�� ���� �ִ´�.
//		int b1[] = b; // �Ű� ���� �迭 b�� ���� �ִ´�. 
		int range = a.length+b.length; //�� �迭�� ���̸� ���Ͽ�
		int addArray[] = new int[range]; // c1 �迭�� ũ�⸸ŭ ����.

//		System.out.println(range);

		for (int i = 0; i < a.length; i++) { //ó�� �Ű������迭 a�� ���̸�ŭ ������ ���ο� �迭 c1�� �ְ�,
			addArray[i]=a[i];
//			System.out.print(c1[i]+" ");
		}
//		System.out.println();

		for (int i = a.length; i < range; i++) { // �ι�° �Ű������迭 b�� ���� ��ŭ ������ ���� �ִµ�, �������� a �Ű� ���� �迭�� ������ �־��ش�.
			addArray[i]=b[i-a.length];
//			System.out.print(c1[i]+" ");
		}

//		System.out.println();
		
//		for (int i = 0; i < range; i++) { //c1�迭�� �� ��� ������ Ȯ���� ����.
//			System.out.print(c1[i]+" ");
//		}
		return addArray; //�迭�� ������ �� [] ����. ������ ������.
	}

	public static void print(int[] a) {
		System.out.println("�� �迭�� ��ġ��");
		System.out.print("[");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.print("]");
	}
}

public class StaticEx {
	public static void main(String[] args) {
		int[] array1 = {1,5,7,9,11,13,15};
		int[] array2 = {3,6,-1,100,77};
		int[] array3 = ArrayUtil.concat(array1,array2);
		ArrayUtil.print(array3);
	}
}
