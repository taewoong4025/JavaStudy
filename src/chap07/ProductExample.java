package chap07;

public class ProductExample {
	public static void main(String[] args) {
		
		Product <TV,String> product = new Product<>();
		
		product.setKind(new TV());
		product.setModel("½º¸¶Æ®TV");
		TV tv = product.getKind(); // TV tv = new TV();
		String tvModel = product.getModel();
		System.out.println(tv);
		System.out.println(tvModel);
		
		Product <Car, String> product2 =  new Product<>();
		product2.setKind(new Car());
		product2.setModel("µðÁ©");
		
		Car car = product2.getKind();
		String carModel = product2.getModel();
	
		System.out.println(car);
		System.out.println(carModel);
		

	}
}
