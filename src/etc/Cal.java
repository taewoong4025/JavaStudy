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


// ��� :��� ����(�ʵ�:������Ƽ(JSP����))x,y , ��� �Լ�(�޽��)Calc(������)
// this �ڱ� �ڽ��� ��ü
// ��ü . �޼ҵ� ȣ�� ex) Scanner.nextInt(); ���� Scanner ��ä���� nextInt()�޼��� ȣ��.
// new ��� x : ��ü �����ϴ� ��쵵 ����.
// method(method ȣ��): ��ü ����
// ���� �޸𸮿� �Ҵ� �Ǵ� �� -> �ν��Ͻ�
// �Ű����� : ����, �Ķ����(parameter) ������ ����.
