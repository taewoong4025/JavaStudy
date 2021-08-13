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
		System.out.println("나의 IPTV는 "+getIp()+" 주소의 "+getSize()+"인치 "+getPixel()+" 컬러");
	}
	
	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2",32,2048);
		iptv.printPrioirty();
	}
}
