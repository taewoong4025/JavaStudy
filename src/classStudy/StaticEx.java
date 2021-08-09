package classStudy;

class ArrayUtil{
	public static int[] concat(int[] a , int[] b) {
//		int a1[] = a; // 매개 변수 배열 a의 값을 넣는다.
//		int b1[] = b; // 매개 변수 배열 b의 값을 넣는다. 
		int range = a.length+b.length; //두 배열의 길이를 더하여
		int addArray[] = new int[range]; // c1 배열의 크기만큼 생성.

//		System.out.println(range);

		for (int i = 0; i < a.length; i++) { //처음 매개변수배열 a의 길이만큼 돌려서 새로운 배열 c1에 넣고,
			addArray[i]=a[i];
//			System.out.print(c1[i]+" ");
		}
//		System.out.println();

		for (int i = a.length; i < range; i++) { // 두번째 매개변수배열 b의 길이 만큼 돌리고 값을 넣는데, 시작점을 a 매개 변수 배열의 끝에서 넣어준다.
			addArray[i]=b[i-a.length];
//			System.out.print(c1[i]+" ");
		}

//		System.out.println();
		
//		for (int i = 0; i < range; i++) { //c1배열에 다 들어 갔는지 확인차 실행.
//			System.out.print(c1[i]+" ");
//		}
		return addArray; //배열을 리턴할 때 [] 생략. 있으면 오류뜸.
	}

	public static void print(int[] a) {
		System.out.println("두 배열을 합치면");
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
