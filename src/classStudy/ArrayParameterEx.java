/**
 * 배열을 파라미터로 받아서 작성하는 메소드.
 */
package classStudy;

public class ArrayParameterEx {
	static void printStringArray(String[] stringArray){
		for (int i = 0; i < stringArray.length; i++) {
			System.out.print(stringArray[i]+" ");
		}
		System.out.println();
	}		
		
	
	static void replaceBe(String[] stringArray) {
		for (int i = 0; i < stringArray.length; i++) {
			if(stringArray[i].equals("be")) {
				stringArray[i]="eat";
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		String stringArray[] = {"to","be","or","not","to","be"};
		
		printStringArray(stringArray);
		replaceBe(stringArray);
		printStringArray(stringArray);
	}
}
