package AbstractStudy;

interface PhoneInterface1{
	public static final int TIMEOUT = 10000;
	void sendCall(); // �߻� �޼ҵ����� public abstract ��������
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
		System.out.println("������~");
	}

	@Override
	public void receiveCall() {
		System.out.println("��ȭ �޾ҽ��ϴ�.");
	}

	@Override
	public void play() {
		System.out.println("�������");
	}

	@Override
	public void stop() {
		System.out.println("���Ǹ���");
	}

	@Override
	public void sendSMS() {
		System.out.println("���ڸ� ���½��ϴ�.");
	}

	@Override
	public void receiveSMS() {
		System.out.println("���ڰ� �Խ��ϴ�.");
	}
	public void schedule() {
		System.out.println("���� �����մϴ�.");
	}
	
}
public class InterfaceEx2 {
  public static void main(String[] args) {
	SmartPhone phone = new SmartPhone();
	phone.printLogo();
	phone.receiveCall();
	phone.play();
	System.out.println("3�� 5�� ���ϸ�"+ phone.calcuate(3, 5));
	phone.schedule();
}
	
	
	
	
	
	
	
	
}
