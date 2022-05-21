package ex04;

import java.util.HashMap;

public class HashMapEx02 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("사과", 1);
		map.put("복숭아", 2);
		map.put("포도", 3);
		map.put("사과", 4);
		map.put("복숭아", 5);
		// HashMap은 중복된 key값이 들어갈 경우, 나중에 put된 키값으로 저장된다.
		
		System.out.println("map : " + map);
		System.out.println("map.entrySet() : " + map.entrySet());
		System.out.println("map.keySet() : " + map.keySet());
		System.out.println("map.values() : " + map.values());
		
		
	}
}
