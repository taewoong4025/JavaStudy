package chap09;

import java.io.File;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {
	public static void main(String[] args) throws Exception {
		File dir = new File("D:/temp/dir");
		File file1 = new File("D:/temp/file1.txt");
		File file2 = new File("D:/temp/file2.txt");
		File file3 = new File(new URI("file:/D:/temp/file3.txt"));
		
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		if(file1.exists() == false) {
			file1.createNewFile();
		}
		if(file2.exists() == false) {
			file2.createNewFile();
		}
		if(file3.exists() == false) {
			file3.createNewFile();
		}
		File temp = new File("d:/temp");
		File[] contents = temp.listFiles();
		
		System.out.println("��¥                �ð�                                              ����         ũ��             �̸�");
		System.out.println("----------------------------------------------------");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
		for (int i = 0; i < contents.length; i++) {
			System.out.print(sdf.format(new Date(contents[i].lastModified())));
			
			
			if(contents[i].isDirectory()) {
				System.out.print("\t\t<DIR>\t\t"+contents[i].getName());
			}
			else {
				System.out.print("\t\t<file>\t"+contents[i].length()+"\t"+contents[i].getName());
			}
			System.out.println();
		}
	}
}
