/**
 * 자바 배열 리턴
 * 	정수형 배열 리턴하는 메소드를 만든다.
 * 
 */
package JavaEx2;

public class ArrayMake {
	
	 static int[] makeArray() {	// 정수형 배열 리턴하는 메소드 생성
		int temp[] = new int[10]; // 배열 생성하고
		for (int i = 0; i < temp.length; i++) { // 1~10으로 초기화
			temp[i]=i+1;
		}
		return temp; // 배열리턴
	}
	
	public static void main(String[] args) {
		
		int intArray[]; //배열 레퍼런스 변수 선언.
		intArray = makeArray(); //메소드를 호출하고 메소드가 리턴한 배열을 전달 받는다.
		
		for (int i = 0; i < intArray.length; i++) {
			
			System.out.println(intArray[i]+100);
		}
	
	
	}
}
