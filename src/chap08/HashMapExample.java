/**
 * 맵 컬렉션
 * 키값 중복 x, 밸류 중복 O
 * 순서없음.
 */
package chap08;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
			map.put("임영웅", 31);
			map.put("영탁",38);
			map.put("이찬원",25);
			
			System.out.println("총 Entry 수 : "+map.size());
//			System.out.println(map.get("임영웅"));
			System.out.println();
		
			Set<String> keySet=map.keySet(); // put 메소드를 통해 입력받은 객체의 키값을 저장?
			Iterator<String> keyIterator = keySet.iterator(); // 키값을 통해 순회하기 위해서.
			
			while(keyIterator.hasNext()) {
				String key = keyIterator.next();
//				Integer value = map.get(key);
				int value = map.get(key); // 오토 언박싱
				System.out.print("\t"+key+":"+value);
			}
			System.out.println();
			map.remove("임영웅");
			System.out.println("총 Entry 수 : "+map.size());
			
			Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
			Iterator<Map.Entry<String, Integer>> entryIterator =  entrySet.iterator();
			
			while(entryIterator.hasNext()) {
				Map.Entry<String, Integer> entry = entryIterator.next();
				String key = entry.getKey();
				Integer value = entry.getValue();
				
				System.out.print("\t"+key+":"+value);
			}
			System.out.println();
			
			map.clear();
			System.out.println("총 Entry 수 : "+map.size());
		}
}
