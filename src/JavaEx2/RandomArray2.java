package JavaEx2;

import java.util.Scanner;

public class RandomArray2 {
	public static boolean exists(int a[], int from, int r) { // ���� �ߺ� ���� �޼ҵ� ����
		for (int i = 0; i < from; i++) {
			if(a[i]==r) {				
				return true;
			}
		}
		return false;

	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("���� �� ��>>");
		int n = sc.nextInt();
		int intArray[]= new int[n];
		for (int i = 0; i < intArray.length; i++) {	
//			intArray[i] = (int) (Math.random()*100+1); //���� �ϳ� ����.
//			for(int j=0; j<i; j++) {
//				if(intArray[i]==intArray[j]) { //�迭 0 �� 1�� ���� �ߺ��Ǹ� i--���༭ j=1���� ��� ����. 
//					i--;
//				}
//			}

			int r = (int) (Math.random()*100+1);
			if(exists(intArray, i, r)) {
				i--;
				continue;
			}
			intArray[i]=r;

		}
		for (int i = 0; i < intArray.length; i++) {			
			if(i%10==0 && i!=0) {
				System.out.println();
				System.out.print(intArray[i]+ " ");				
			}else {
				System.out.print(intArray[i]+ " ");		
			}

		}
		sc.close();
	}
}
