package JAVA_7_28;

import java.util.Scanner;

public class Calc728 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int fiveTenThousand=50000; // 5만원
		int tenThousand=10000; // 만원
		int thousand=1000; // 천원
		int hundred=100; // 백원
		int fifty=50; // 오십원
		int ten=10; // 십원
		int one=1; // 일원
		int res=0;
		
		System.out.print("금액을 입력하시오>>");
		int money = sc.nextInt();
		res=money/fiveTenThousand;
		money=money%fiveTenThousand;

		if(res>0) {
			System.out.println("오만원권 "+res+"매");
		}
		res=money/tenThousand;
		money=money%tenThousand;
		if(res>0) {
			System.out.println("만원권 "+res+"매");
		}	
		res=money/thousand;
		money=money%thousand;
		if(res>0) {
			System.out.println("천원권 "+res+"매");
		}
		res=money/hundred;
		money=money%hundred;
		if(res>0) {
			System.out.println("백원 "+res+"매");
		}
		res=money/fifty;
		money=money%fifty;
		if(res>0) {
			System.out.println("오십원 "+res+"매");
		}
		res=money/ten;
		money=money%ten;
		if(res>0) {
			System.out.println("십원 "+res+"매");
		}	
		res=money/one;
		money=money%one;
		if(res>0) {
			System.out.println("일원 "+res+"매");
		}

		sc.close();
	}
}
