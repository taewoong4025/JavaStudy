package chap09;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample11 {
	public static void main(String[] args) throws Exception {
			Writer writer =  new FileWriter("D:/output2.txt");
			
			char[] data = "ȫ�浿".toCharArray(); //���ڿ��� ���� �迭�� ����.
			
			for (int i = 0; i < data.length; i++) {
				writer.write(data[i]);
			}
			writer.close();
	}
}
