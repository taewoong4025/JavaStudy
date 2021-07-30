package classPractice;

public class TV {
	
	private String manufacturer;
	private int year;
	private	int size;
		
	public TV(String f, int y, int s) {
		this.manufacturer=f;
		this.year=y;
		this.size=s;
	}
	
	
	public void show() {
		
		System.out.println(this.manufacturer+"에서 만든 "+this.year+"년형"+this.size+"인치 TV");
	}
	
	public static void main(String[] args) {
		TV myTV = new TV("LG",2017,32);
		myTV.show();
	}
	
}
