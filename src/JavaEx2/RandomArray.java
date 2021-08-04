package JavaEx2;

import java.util.Scanner;

public class RandomArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 몇 개>>");
		int n = sc.nextInt();
		int intArray[]= new int[n];
		for (int i = 0; i < intArray.length; i++) {		intArray[i] = (int) (Math.random()*100+1);
		}
		for (int i = 0; i < intArray.length; i++) {			
			if(i%10==0 && i!=0) {
				System.out.println();
				System.out.print(intArray[i]+ " ");				
			}else {
				System.out.print(intArray[i]+ " ");			}

		}
		sc.close();
	}
}
