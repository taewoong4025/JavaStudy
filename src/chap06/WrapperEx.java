package chap06;

public class WrapperEx {
	public static void main(String[] args) {
		char c1 ='4',c2='F';
		
		if(Character.isDigit(c1)) {
			System.out.println(c1+"�� ����");
		}
		else {
			System.out.println(c1+"�� ���ڰ� �ƴ�.");
		}
		
		if(Character.isAlphabetic(c2)) {
			System.out.println(c2+"�� ������");
		}
		else {
			System.out.println(c2+"�� �����ڰ� �ƴ�.");
		}
		System.out.println(Integer.parseInt("-123"));
		System.out.println(Integer.toHexString(28));
		System.out.println(Integer.toBinaryString(129));
		
		Double d = Double.valueOf(3.14);
		
		System.out.println(d.toString());
		System.out.println(Double.parseDouble("3.14"));
		double dd = d.doubleValue();
		System.out.println(dd);
		
		boolean b = (4>3);
		System.out.println(Boolean.toString(b));
		System.out.println(Boolean.parseBoolean("false"));
		
		Integer ten = Integer.valueOf(10);
		
		
	}
}
