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
//i) public      : ��� ������ ���
//
//ii) protected : ���� ��Ű��(����)�� �ִ� ��ü�� ��Ӱ����� ��ü�鸸 ���
//
//iii) default    : ���� ��Ű��(����)�� �ִ� ��ü�鸸 ���
//
//iv) private    : ���� ��ü �������� ���

//���� ��Ű���� Ŭ���� �޼ҵ忡 ���ؼ� �̵��ϰ���� �� ctrl+���콺 ���� open declaration�ϰ� alt+����Ű(��,��)�ϸ� �̵�����.

//�� ĳ���� : ���� = ����

