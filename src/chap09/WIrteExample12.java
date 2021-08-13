package chap09;

import java.io.FileWriter;
import java.io.Writer;

public class WIrteExample12 {
	public static void main(String[] args) throws Exception {
		Writer writer =  new FileWriter("D:/output2.txt");
		
		char[] data = "임영웅".toCharArray(); //문자열을 문자 배열로 만듬.
		
		writer.write(data);
		writer.close();

	}
}
