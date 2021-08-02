package JavaEx2;

public class RandomTen {
	public static void main(String[] args) {
		int intArray[] = new int[10];
		
		double avg;
		int sum=0;
		
		System.out.print("·£´ýÇÑ Á¤¼öµé :");
		for (int i = 0; i < intArray.length; i++) {
			intArray[i]=(int) (Math.random()*10+1);
			System.out.print(intArray[i]+" ");
		}
		
		for (int i = 0; i < intArray.length; i++) {
			sum+=intArray[i];
		}
		avg=sum/intArray.length;
		
		System.out.println();
		System.out.println("Æò±ÕÀº "+ avg);
		
	}
}
