package chap06;

public class StringBufferEx {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb);
		
		sb.append(" is pencil."); // �����̱�
		System.out.println(sb);
		
		sb.insert(7," my"); // ����
		System.out.println(sb);
		
		sb.replace(8, 10,"your"); //��ü
		System.out.println(sb);
		
		sb.delete(8, 13); //����
		System.out.println(sb);
		
		sb.setLength(4); //���� �缳��
		System.out.println(sb);
	}
}
