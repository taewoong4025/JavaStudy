/**
 * 추상클래스는 객체 생성이 안된다.
 * 인터페이스는 다중 상속가능.
 * 인터페이스는 객체 배열형태로 생성가능.
 */
package AbstractStudy;

public class AnimalMain {
	public static void main(String[] args) {
//		Animal a = new Animal();
//		Bird b = new Bird();
		Penguin p = new Penguin();
		p.swim();
		Bird p2 = new Penguin(); // 업 캐스팅
		p2.walk();
		Penguin p3=(Penguin) p2; // 다운 캐스팅
		
		p3.swim();
		
		Bird d2 = new Duck(); // 업 캐스팅 ( 슈퍼 클래스 멤버만 접근가능)
		d2.walk();
		d2.eat();

		Duck d3 = (Duck)d2; //다운 캐스팅
		d3.fly();
		d3.walk();
		d3.eat();
		d3.swim();
				
	Swim2[] s = new Swim2[2]; //객체배열 형태로 생성가능.
		s[0] = new Penguin();
		s[1] = new Duck();
	
		s[0].swim();
	}
}
