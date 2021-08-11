package classStudy;

class TV{
	private int size;

	public TV(int size) {
		this.size = size;
	}

	protected int getSize() {
		return size;
	}
}

class ColorTV extends TV{

	private int pixel;

	public ColorTV(int size, int pixel) {
		super(size);
		this.pixel = pixel;
	}

	protected int getPixel() {
		return pixel;
	}

	public void printProperty() {
		System.out.print(getSize()+"인치 "+getPixel()+"컬러");
	}

	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32,1024);
		myTV.printProperty();
	}
}


