package AbstractStudy;

public class Duck extends Bird implements Swim2,Fly2{
	
	@Override
	public void swim() {
		System.out.println("duck swim");
	}
//	public void fly() {
//		System.out.println("duck fly");
//	}

	@Override
	public void fly() {
		System.out.println("duck fly");
	}

}
