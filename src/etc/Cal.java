package etc;

public class Cal {
	private int x,y;
	public Cal(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public int sum() {
		return x+y;
	}

}


// 멤버 :멤버 변수(필드:프로퍼티(JSP에선))x,y , 멤버 함수(메쏘드)Calc(생성자)
// this 자기 자신의 객체
// 객체 . 메소드 호출 ex) Scanner.nextInt(); 에서 Scanner 객채에서 nextInt()메서드 호출.
// new 사용 x : 객체 생성하는 경우도 있음.
// method(method 호출): 객체 생성
// 실제 메모리에 할당 되는 것 -> 인스턴스
// 매개변수 : 인자, 파라미터(parameter) 동일한 말임.
