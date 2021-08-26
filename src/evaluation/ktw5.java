package evaluation;

public class ktw5 {

	public static void main(String[] args) {

		for (int i = 1; i < 100; i++) { //1~99까지 반복
			int tenNumber=i/10; // i값 10의자리 수 저장.
			int oneNumber=i%10; // i값 1의자리 수 저장.

			if(tenNumber==3 || tenNumber==6 || tenNumber==9) { //10의자리수가 3 6 9 이고, 
				if(oneNumber==3 || oneNumber==6 || oneNumber==9) { // 1의자리수가 3 6 9 이면 박수두번 ex)33 36 39
					System.out.println(i+" 박수두번");
				}
				else { // 10의 자리만 3,6,9 일 경우
					System.out.println(i+" 박수한번");
				}
			}

			else if(oneNumber==3 || oneNumber==6 || oneNumber==9){ // 일의 자리 숫자가 3 6 9일 경우.
				System.out.println(i+" 박수한번");
			}
		}
	}
}
