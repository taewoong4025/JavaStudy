package JavaEx1;

//import java.util.Scanner;

public class DoWhileTest {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		int i = 1;
		int sum=0;
		do {
			if(i%2==0) {
				sum+=i;
			}
			i++;
		} while (i<100);
		
		System.out.println(sum);

	}

}
