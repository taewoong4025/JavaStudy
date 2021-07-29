package JAVA_7_28;

import java.util.Scanner;

public class ScoreAverage728 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double score[][] = {{3.3,3.4},{3.5,3.6},{3.7,3.8},{3.9,4.0}};
		
		double sum=0;
		
		for(int year = 0; year<score.length; year++) {
			for(int term = 0; term<score[year].length; term++) {
				sum += score[year][term];
			}
		}
		
		int n=score.length;
		int m=score[0].length;
		System.err.println("4년 전체 평점 평균은 >>"+sum/(n*m));
		sc.close();
	}
}
