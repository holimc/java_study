package ex04;

import java.util.HashMap;

public class HashMapEx01 {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("감자", "튀김");
		hm.put("고구마", "맛탕");
		hm.put("옥수수", "버터구이");
		hm.put("단호박", "찜");
		hm.put(100, 559);
		
		System.out.println("고구마로 하는 조리법 hm.get('고구마') : " + hm.get("고구마"));
		System.out.println("감자로 하는 조리법 hm.get('감자') : " + hm.get("감자"));
		System.out.println("hm.get(100) : " + hm.get(100));
	}
}
