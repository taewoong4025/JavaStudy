package classStudy;

class Weapon{
	protected int fire() {
		return 1;
	}
}

class canon extends Weapon{
	@Override
	protected int fire() {
		return 10;
	}
	
}
public class Overriding {
	public static void main(String[] args) {
		Weapon weapon = new Weapon();
		System.out.println("�⺻ ������ ��� �ɷ���"+weapon.fire());
	}
}
