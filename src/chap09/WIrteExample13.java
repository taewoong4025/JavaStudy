package chap09;

import java.io.FileWriter;
import java.io.Writer;

public class WIrteExample13 {

	public static void main(String[] args) throws Exception {
		Writer writer =  new FileWriter("D:/output2.txt");

		char[] data = "�ӿ���".toCharArray(); //���ڿ��� ���� �迭�� ����.

		writer.write(data, 1, 2);
		writer.close();

	}
}
