package ex11;
// 일반 배열의 형식으로 큐를 만드는게 아닌, 링버퍼 자료 형식을 구현하는 식으로 큐를 만들기
public class IntQueueEx01 {
	private int max;
	// 큐의 용량
	private int front;
	// 큐의 첫번째 요소 커서
	private int rear;
	// 큐의 마지막 요소 커서
	private int num;
	// 현재 데이터의 수
	private int[] que;
	// 큐 배열
	
	public class EmptyIntQueueException extends RuntimeException{
		public EmptyIntQueueException() {}
	}
	
	public class OverflowQueueException extends RuntimeException{
		public OverflowQueueException() {}
	}
	
	public IntQueueEx01(int capacity) {
		num = front = rear = 0;
		max = capacity;
		try {
			que = new int[max];
		}catch(OutOfMemoryError e) {
			max = 0;
		}
	}
	// 생성시에 생성자에서 큐를 비워주기 때문에, num, front, rear의 값을 전부 0으로 초기화해준다. 이후 배열본체 생성
	
	public int enque(int x) throws OverflowQueueException{
		if(num>= max) {
			throw new OverflowQueueException();
		}
		que[rear++] = x;
		// 여기까지는 스택처럼 배열에 값을 더해주는 과정이다. 
		num++;
		if(rear == max) {
			rear = 0;
		}
		// 단, 링버퍼인만큼 데이터를 넣다보면 배열의 최대값(max)에 도달할 수 있으므로 같아지게되면 rear의 값을 배열의 시작부분으로 변경해준다.
		return x;
	}
	
	public int deque() throws EmptyIntQueueException{
		if(num<= 0) {
			throw new EmptyIntQueueException();
		}
		int x = que[front++];
		num--;
		if(front==max) {
			front = 0;
		}
		// 인큐의 과정과 마찬가지로, 링버퍼는 배열의 크기가 12라고 가정시
		// int x = que[11]에 데이터가 들어가면 배열의 최대범위에 들어가있는 상태이다.
		// 이후 후위 연산자를 통해서 front의 값이 배열 크기인 max와 같아지게 된다면, 0으로 변경하여 앞으로 보낸다.
		
		return x;
	}
	public int peek() throws EmptyIntQueueException{
		if(num<=0) {
			throw new EmptyIntQueueException();
		}
		return que[front];
	}
	// num (실질적인 배열값이 있는지) 확인후, 있으면 front를 보낸다.
	
	public int indexOf(int x) {
		for(int i=0; i<num; i++) {
			int idx = (i+front) % max;
			// 링 버퍼이기 때문에, 배열을 0부터 배열 마지막까지 돌리는것이 아니라 front부터 돌린다.
			// 또한, max로 나눈 나머지를 돌림으로서 배열의 최대 크기를 벗어나지않고 배열의 시작부분으로 보내어 검색을 진행
			if(que[idx] == max) {
				return idx;
			}
		}
		return -1;
	}
	
	public void clear() {
		num = front = rear = 0;
	}
	
	public int capacity() {
		return max;
	}
	
	public int size() {
		return num;
	}
	
	public boolean isEmpty() {
		return num<=0;
	}
	
	public boolean isFull() {
		return num>=max;
	}
	
	public void dump() {
		if(num<=0) {
			System.out.println("큐가 비어있습니다.");
		}else {
			for(int i=0; i<num; i++) {
				System.out.print(que[(i+front)%max]+" ");
			}
			System.out.println();
		}
	}
	
	// 임의의 데이터를 검색하는 int search(int x)를 추가하시오
	// 메서드 indexOf처럼 배열의 인덱스를 반환하는게 아니라, 큐에서 몇번째에 있는가를 반환하는 메서드이다
	// front부분에 있다면 1을 반환하고, 만일 검색에 실패한다면 0을 반환
	
	public int search(int x) {
		for(int i=0; i<num; i++) {
			if(que[(i+front)%max] == x) {
				return i+1;
			};
		}
		return 0;
	}
}
