package chap08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListEx {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		String name;
		int max=0;
		int index=0;
		
		for (int i = 0; i < 4; i++) {
			System.out.print("이름을 입력하세요>>");
			name = sc.next();
			list.add(name);
			
		}
		
		for (int i = 0; i < list.size(); i++) {
			
			if(max<list.get(i).length()) {
				max=list.get(i).length();
			}
			
			if(list.get(i).length()==max) {
				index=i;
			}
			
			System.out.print(list.get(i)+" ");
		}
		
		System.out.println();
		System.out.print("가장 긴 이름은 :"+list.get(index));
		
		
		
		sc.close();
		
	}
}
