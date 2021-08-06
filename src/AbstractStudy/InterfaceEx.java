package AbstractStudy;
interface PhoneInterface{
	public static final int TIMEOUT = 10000;
	void sendCall(); // �߻� �޼ҵ����� public abstract ��������
	void receiveCall();
	default void printLogo() {
		System.out.println("** Phone **");
	}
	
}

class SamsungPhone implements PhoneInterface{ 

	@Override
	public void sendCall() { //�߻� �޼ҵ� ����
		System.out.println("�츮������������");
	}

	@Override
	public void receiveCall() {//�߻� �޼ҵ� ����
		System.out.println("��ȭ�� �Խ��ϴ�.");
	}
	
	public void flash() {
		System.out.println("��ȭ�⿡ ���� �������ϴ�.");
	}
	
}
public class InterfaceEx {
	public static void main(String[] args) {
		SamsungPhone phone = new SamsungPhone();
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();
	}

}
