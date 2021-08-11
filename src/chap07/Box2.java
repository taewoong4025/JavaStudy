/**
 *  제네릭 사용 예제는 2가 붙었음.
 */
package chap07;

public class Box2<T> {
	private T t; // 타입변수 T에는 기본 데이터 타입은 사용 불가능.

	public void set(T t) {
		this.t = t;
	}
	
	public T get() {
		return t;
	}

}
