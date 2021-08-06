package AbstractStudy;

interface PhoneInterface1{
	public static final int TIMEOUT = 10000;
	void sendCall(); // 추상 메소드지만 public abstract 생략가능
	void receiveCall();
	default void printLogo() {
		System.out.println("** Phone **");
	}
}

interface MobilePhoneInterface extends PhoneInterface1{
	void sendSMS();
	void receiveSMS();
}

interface MP3Interface {
	public void play();
	public void stop();
	
}

class PDA{
	public int calcuate(int x, int y) {
		return x+y;
	}
	
}

class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface{

	@Override
	public void sendCall() {
		System.out.println("따르릉~");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화 받았습니다.");
	}

	@Override
	public void play() {
		System.out.println("음악재생");
	}

	@Override
	public void stop() {
		System.out.println("음악멈춤");
	}

	@Override
	public void sendSMS() {
		System.out.println("문자를 보냈습니다.");
	}

	@Override
	public void receiveSMS() {
		System.out.println("문자가 왔습니다.");
	}
	public void schedule() {
		System.out.println("일정 관리합니다.");
	}
	
}
public class InterfaceEx2 {
  public static void main(String[] args) {
	SmartPhone phone = new SmartPhone();
	phone.printLogo();
	phone.receiveCall();
	phone.play();
	System.out.println("3과 5를 더하면"+ phone.calcuate(3, 5));
	phone.schedule();
}
	
	
	
	
	
	
	
	
}
