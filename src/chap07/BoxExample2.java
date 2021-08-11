/**
 *  제네릭 사용 예제는 2가 붙었음.
 */

package chap07;

public class BoxExample2 {
	public static void main(String[] args) {
		Box2<String> box2 = new Box2<String>();
		box2.set("Hello");
//		box2.set(10); // 타입검사. String 타입인데 int 타입의 수가 왔으니.
//		box2.set(new Integer(10)); // 
		String greet = box2.get();
		System.out.println(greet);
		
		Box2<Integer> box3 = new Box2<Integer>(); // Integet 타입으로 생성
		box3.set(7);
		int value = box3.get();
		System.out.println(value);
		
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		
		if(i1.equals(i2)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
	}
}
