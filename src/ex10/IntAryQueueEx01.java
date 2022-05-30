package ex10;

public class IntAryQueueEx01 {
	private int max;
	private int num;
	private int[] que;
	
	public class EmptyIntQueueException extends RuntimeException{
		public EmptyIntQueueException() {}
	}
	
	public class OverflowIntQueueException extends RuntimeException{
		public OverflowIntQueueException() {}
	}
	
	public IntAryQueueEx01(int capacity) {
		num = 0;
		max = capacity;
		try {
			que = new int[max];
		}catch(OutOfMemoryError e) {
			max = 0;
		}
	}
	
	
	public int enque(int x) throws OverflowIntQueueException{
		if(num>=max) {
			throw new OverflowIntQueueException();
		}
		return que[num++] = x;
	}
	// 인큐는 스택과 큰 차이가 없다. rear(뒷부분) 쪽으로 데이터가 하나씩 들어가면 된다.
	
	public int deque() throws EmptyIntQueueException{
		if(num<=0) {
			throw new EmptyIntQueueException();
		}
		int x = que[0];
		for(int i=0; i<num-1;i++) {
			que[i] = que[i+1];
		}
		num--;
		return x;
	}
	// 스택과 큐의 차이점으로, 데이터가 나가는 부분이 다르기 때문에 메서드에 차이가 생긴다.
	// 큐는 선입 선출로 pop과 다르기 때문에, 맨앞의 데이터 (배열로 만들때 [0]인 부분) 이 나가고, 이후 데이터를 앞으로 하나씩 땡겨줘야한다.
	
	public int peek() throws EmptyIntQueueException{
		if(num<=0) {
			throw new EmptyIntQueueException();
		}
		return que[num-1];
	}
	public int indexOf(int x) {
		for(int i=0; i<num-1; i++) {
			if(que[i] == x) {
				return i;
			}
		}
		return -1;
	}
	public void clear() {
		num = 0;
	}

	public int capacity() {
		return max;
	}

	public int size() {
		return num;
	}

	public boolean isEmpty() {
		return num <= 0;
	}

	public boolean isFull() {
		return num >= max;
	}
	
	public void dump() {
		if(num<=0) {
			System.out.println("큐가 비어있습니다.");
		}else {
			for(int i=0; i<num; i++) {
				System.out.print(que[i] + " ");
			}
			System.out.println();
		}
	}
}
