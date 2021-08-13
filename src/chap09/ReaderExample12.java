package chap09;

import java.io.FileReader;
import java.io.Reader;

public class ReaderExample12 {
	public static void main(String[] args) throws Exception {

		Reader reader = new FileReader("D:/test2.txt");
		int readCharNo;

		char[] cbuf = new char[2]; // 배열 크기만큼  받아옴..
		String data = "";

		while (true) {
			readCharNo = reader.read(cbuf);

			if(readCharNo == -1) {
				break;
			}
				
			data += new String(cbuf, 0, readCharNo);
		}
		System.out.println(data);
		
		reader.close();
	}
}
