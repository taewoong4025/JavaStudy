package chap09;

import java.io.FileWriter;
import java.io.Writer;

public class WIrteExample14 {

	public static void main(String[] args) throws Exception {
		Writer writer =  new FileWriter("D:/output2.txt");

		String data = "�ȳ� �ڹ� ���α׷�";
		writer.write(data, 3, 2);
		writer.close();

	}


}
