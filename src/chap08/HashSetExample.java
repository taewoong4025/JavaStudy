package chap08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class AA{
	int aa = 11;
	String bb = "azaz";
}

public class HashSetExample {
	public static void main(String[] args) {
		Set<String>set = new HashSet<String>();
//		Set<Object> set = new HashSet<>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("servlet/JSP");
		set.add("myBatis");
//		AA a = new AA();
//		set.add(a);
		
		int size = set.size();
		System.out.println("�� ��ü�� : "+size);
		
		Iterator<String> iterator = set.iterator();
//		Iterator<Object> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			String element = iterator.next();
//			Object element = iterator.next();
			System.out.println("\t"+element);
		}
		
		set.remove("JDBC");
		set.remove("myBatis");
		System.out.println("�� ��ü�� : "+set.size());
		
		for(String string : set) {
			System.out.println("\t"+string);
		}
		
		if(set.isEmpty()) {
			System.out.println("��� ����");
		}
		else {
			System.out.println("��ü ����");
		}
		
		set.clear();
		
		if(set.isEmpty()) {
			System.out.println("��� ����");
		}
		else {
			System.out.println("��ü ����");
		}
	}
}

