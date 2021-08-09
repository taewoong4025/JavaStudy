package JavaEx2;

public class ArrayTwoTenYear {
	public static void main(String[] args) {
		int baby[][] = new int[120][5];
		
		for (int month = 0; month < baby.length; month++) {
			for (int country = 0; country < baby[month].length; country++) {

				baby[month][country]=(month+1)*100+(country+1);
			}
		}
		int sum=0;
		
		for (int month = 0; month < baby.length; month++) {
			for (int country = 0; country < baby[month].length; country++) {
				
				sum+=baby[month][country];
			}
		}
		System.out.println(baby.length/12+"년간 5개 나라의 총 신생아 수는 "+sum);
	}
}
