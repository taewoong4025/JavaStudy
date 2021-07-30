package JavaEx1;

public class ExForeach {
	enum Week{
	월,화,수,목,금,토,일
	}
	public static void main(String[] args) {
		int[] n = {1,2,3,4,5};
		String[] names= {"사과","배","바나나","체리","딸기","포도"};
		
		int sum=0;
		
		for(int k : n) {
			sum+=k;
		}
	System.out.println(sum);
		
		for(String s : names) {
			System.out.println(s);
		}
		
		for(Week w : Week.values() ) {
			System.out.println(w+"요일");
		
		}		
	}
}
