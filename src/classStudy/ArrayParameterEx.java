/**
 * �迭�� �Ķ���ͷ� �޾Ƽ� �ۼ��ϴ� �޼ҵ�.
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
