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
}
