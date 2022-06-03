package ex12;

public class QueenBEx02 {
	static boolean[] flag = new boolean[8];
	// Ex01과 다르게 추가된 배열 flag
	// 각 행에 퀸이 배치되어있는지 체크하는데 쓰이는 배열이다.
	static int[] pos = new int[8];
	// 각 열의 퀸의 위치를 나타내는 배열 
	
	
	static void print() {
		for(int i=0; i<8; i++) {
			System.out.printf("%2d", pos[i]);
		}
		System.out.println();
	}
	
	static void set(int i) {
		for(int j=0; j<8;j++) {
			if(flag[j] == false) {
				// if문 을 통해, 해당 행에 퀸이 배치가 되어있는지 확인
				pos[i] = j;
				if(i==7) {
					// 모든열에 배치된 경우 print로 출력 
					print();
				}else {
					flag[j] = true;
					set(i+1);
					// set+1를 반복하여 마지막 열부터 숫자를 채워나가고, 다 실행이 된 경우 이전 열을 작동하므로 
					flag[j] = false;
					// j의 퀸을 false로 바꿔주고 다시 진행한다.
				}
			}
		}
	}
	public static void main(String[] args) {
		set(0);
		// set을 통해 0번째 열부터 시작된다.
	}
}
