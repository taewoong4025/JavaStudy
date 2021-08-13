package chap09;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample1 {
	public static void main(String[] args) throws Exception {
		
		InputStream is = new FileInputStream("D:/test.txt");
		int readByte;
		
		while ((readByte=is.read()) != -1) {
			System.out.println((char)readByte);
		}
		
//		while (true) {
//			readByte = is.read();
//			
//			if(readByte == -1) {
//				break;
//			}
//			System.out.println((char)readByte);
//		}
		is.close();
	}
}
