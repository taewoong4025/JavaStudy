package JavaEx2;

public class ArrayCoronaSum {
	public static void main(String[] args) {
		int intArray[][] = new int[12][3];
		int sum=0;
		
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[i].length; j++) {
				intArray[i][j]=(i+1)*10+(j+1);
			}	
		}
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[i].length; j++) {
				sum+=intArray[i][j];
			}	
		}
		System.out.print("1년 전체 코로나 환자수는 "+sum);
	}
}
