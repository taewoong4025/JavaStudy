package chap09;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample11 {
	public static void main(String[] args) throws Exception {
			Writer writer =  new FileWriter("D:/output2.txt");
			
			char[] data = "홍길동".toCharArray(); //문자열을 문자 배열로 만듬.
			
			for (int i = 0; i < data.length; i++) {
				writer.write(data[i]);
			}
			writer.close();
	}
}
