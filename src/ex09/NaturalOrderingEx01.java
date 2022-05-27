package ex09;

public class NaturalOrderingEx01 implements Comparable<NaturalOrderingEx01> {
	
	// 필드, 메서드
	
	public int compareTo(NaturalOrderingEx01 c) {
		// this가 c보다 크면 양의값, 작으면 음의값, 같으면 0 반환
		/*
		 * if(d1>d2) return 1;
		 * if(d1<d2) return -1;
		 * if(d1==d2) return 0;
		 */
		return 0;
	}
	public boolean equals(Object c) {
		// this가 c와 같으면 true, 틀리면 false
		
		return false;
	}
}
// 자연스러운 순서로 정렬(자연정렬)을 원할때에는 이러한 방식으로 클래스를 정의한다
