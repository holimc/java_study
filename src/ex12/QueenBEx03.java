package ex12;

public class QueenBEx03 {
	static boolean[] flag_a = new boolean[8];
	static boolean[] flag_b = new boolean[15];
	static boolean[] flag_c = new boolean[15];
	// 8*8 배열에서 대각선의 개수는 15개이다.
	static int[] pos = new int[8];
	
	static void print() {
		for(int i=0; i<8; i++) {
			System.out.printf("%2d", pos[i]);
		}
		System.out.println();
	}
	
	static void set(int i) {
		for(int j=0; j<8; j++) {
			if(flag_a[j] == false &&	// Ex02의 flag 배열이다. 가로(j행) 에 배치되어있는지의 여부를 따진다.					
			   flag_b[i+j] == false &&	// ↙ 방향의 대각선에서 배치되어있는지 확인하기 위한 배열이다. j행 i열의 값이기 때문에 i+j로 구한다 
			   flag_c[i-j+7] == false) { // ↘ 방향의 대각선에 배치되어있는지 확인하기 위한 배열이다. j행 i열의 값을 구하기에 i-j+7을 통해 구한다.
				// 위의 세가지 조건을 통해서 필요 하지않는 분기를 없앤다.
				pos[i] = j;
				if(i==7) {
					print();
				}else {
					flag_a[j] = flag_b[i+j] = flag_c[i-j+7] = true;
					set(i+1);
					flag_a[j] = flag_b[i+j] = flag_c[i-j+7] = false;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		set(0);
	}
}
