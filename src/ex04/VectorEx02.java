package ex04;

import java.util.Vector;

public class VectorEx02 {
	public static void main(String[] args) {
		Vector<String> vc = new Vector<String>();
		vc.add("고길동");
		vc.add("도우너");
		vc.add("둘리");
		vc.add("희동이");
		vc.add("마이콜");
		
		System.out.println(vc.size());
		
		vc.remove(1);
		vc.remove("희동이");
		System.out.println(vc.size());
		
		for(int i=0; i<vc.size(); i++) {
			System.out.println(vc.get(i));
		}
		if(vc.contains("마이콜")) {
			int idx = vc.indexOf("마이콜");
			System.out.println(idx);
		}else {
			System.out.println("성능 확실하구만");
		}
		vc.removeAllElements();
		if(vc.isEmpty()) {
			System.out.println("요소가 없다");
		}
	}
}
