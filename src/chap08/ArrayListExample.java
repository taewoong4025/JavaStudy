package chap08;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("servlet/JSP");
		list.add(2,"Database");
		list.add("Spring");
		
		int size = list.size();
		System.out.println(size);
		
		String skill = list.get(2);
		System.out.println("2¹øÂ° ÀÎµ¦½º : "+skill);
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+":"+str);
			
		}
		
		System.out.println();
		
		list.remove(2);
		
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+":"+str);
			
		}
		
		System.out.println();
		
		list.remove("Spring");
		
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+":"+str);
			
		}
		
	}
}
