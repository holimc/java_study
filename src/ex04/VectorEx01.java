package ex04;

import java.util.Vector;

public class VectorEx01 {
	public static void main(String[] args) {
		Vector vc = new Vector<>();
		System.out.println(vc.capacity());
		// capacity는 메모리가 할당 되어있는 공간의 용량이다.
		System.out.println(vc.size());
		System.out.println("--------------------------------------------------------");
		
		
		vc.add("문자열 삽입");
		vc.add(1);
		vc.add(true);
		vc.add(new StringBuffer("스트링버퍼"));
		System.out.println(vc.capacity());
		System.out.println(vc.size());
		System.out.println("--------------------------------------------------------");
		vc.add('a');
		vc.add('b');
		vc.add('c');
		vc.add('d');
		vc.add('e');
		vc.add('f');
		vc.add(0.1);
		
		System.out.println(vc.capacity());
		// 주석 9 -> 그렇기 때문에 Line 18에서 출력할때는 size가 4기 때문에 늘어나지 않았지만 
		// 추가적인 데이터가 들어가서 size가 늘어나면서, 추가적인 할당이 필요하자 10에서 20으로 늘어난다.
		System.out.println(vc.size());
		System.out.println("--------------------------------------------------------");
		for(int i=0;i<vc.size();i++) {
			Object obj = vc.get(i);
			// 여러가지 타입을 삽입 시켰기 때문에, get으로 요소를 꺼낼때 Object 타입으로 선언하여 꺼낸다
			System.out.println(obj);
		}
	}
}
