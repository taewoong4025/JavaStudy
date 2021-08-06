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
		System.out.println("기본 무기의 살상 능력은"+weapon.fire());
	}
}
