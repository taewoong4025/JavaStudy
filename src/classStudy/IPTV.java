package classStudy;

public class IPTV extends ColorTV{
	private String ipAddr;
	public IPTV(String ipAddr, int size, int pixel) {
		super(size, pixel);
		this.ipAddr=ipAddr;
	}

	protected String getIp() {
		return ipAddr;
	}
	
	public void printPrioirty() {
		System.out.println("���� IPTV�� "+getIp()+" �ּ��� "+getSize()+"��ġ "+getPixel()+" �÷�");
	}
	
	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2",32,2048);
		iptv.printPrioirty();
	}
}
