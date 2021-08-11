package chap08;

import java.util.ArrayList;

public class ArrayListExample2 {
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<String>();
		boolean aaa =array.add("oracle");
		System.out.println(aaa);
		boolean bbb =array.add("oracle");
		System.out.println(bbb);
		
		array.add("ms-sql");
		array.add("my-sql");
		
		for (int i = 0; i < array.size(); i++) {
			
			String str = array.get(i);
			
			System.out.println(i+": "+str);
			
		}
	}

}
