package chap09;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WirteExample2 {
	public static void main(String[] args) throws IOException {
	 OutputStream os = new FileOutputStream("D:/output.txt");
		 
		 byte[] data = "DEF".getBytes();
		 
		 os.write(data);
		 os.close();
		
	}
}
