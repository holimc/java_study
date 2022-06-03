package ex12;

public class QueenBEx01 {
	static int[] pos = new int[8];
	
	static void print() {
		for(int i=0; i<8; i++) {
			System.out.printf("%2d", pos[i]);
		}
		System.out.println();
	}
	
	static void set(int i) {
		for(int j=0; j<8; j++) {
			pos[i] = j;
			if(i==7) {
				print();
			}else {
				set(i+1);
			}
		}
	}
	public static void main(String[] args) {
		set(0);
	}
}
// 가지뻗기를 통해, 퀸을 배치하는 조합의 수를 알 수 있다.