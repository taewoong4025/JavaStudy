package app;

import base.Shape;
import derived.Circle;

public class GraphicEditor {
	public static void main(String[] args) {
		Shape shape = new Circle();
		Circle c1 = new Circle();
		c1.draw();
		shape.draw();
	}

}
//i) public      : 모든 접근을 허용
//
//ii) protected : 같은 패키지(폴더)에 있는 객체와 상속관계의 객체들만 허용
//
//iii) default    : 같은 패키지(폴더)에 있는 객체들만 허용
//
//iv) private    : 현재 객체 내에서만 허용

//여러 패키지에 클래스 메소드에 관해서 이동하고싶을 때 ctrl+마우스 왼쪽 open declaration하고 alt+방향키(좌,우)하면 이동편함.

//업 캐스팅 : 상위 = 하위

