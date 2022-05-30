package ex10;

public class IntStackEx01 {
	private int max;
	// 스택의 용량(최대치)
	private int ptr;
	// 스택 포인터 ( 스택에 쌓여있는 데이터수를 나타내는 필드
	private int[] stk;
	// 스택 본체용 배열, 인덱스 0인 요소가 스택의 바닥
	
	public class EmptyIntStackException extends RuntimeException{
		public EmptyIntStackException() {}
	}
	// 실행 예외, 스택이 비어있음 (Empty)
	
	public class OverflowIntStackException extends RuntimeException{
		public OverflowIntStackException() {}
	}
	// 실행 예외, 스택이 꽉참 (Overflow)
	
	public IntStackEx01(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = new int[max];
			// stk 배열 생성
		}catch(OutOfMemoryError e) {
			max = 0;
			// 생성할수 없으면 max = 0;
		}
	}
	// 생성자는 스택 본체용 배열을 생성하는 준비 작업을 수행한다. 생성시 스택은 비어있을 것이므로 ptr을 0으로 초기화해주고
	// 매개변수로 전달받은 값을 max에 복사해 배열 stk의 본체를 만든다.
	
	public int push(int x) throws OverflowIntStackException{
		if(ptr>=max) {
			throw new OverflowIntStackException();
		}
		return stk[ptr++] = x;
	}
	// 전달받은 x를 stk[ptr]에 저장하고, 스택포인터를 증가시킨다. 이후 푸시한값을 리턴. 
	// 만일, ptr>=max인 경우 스택이 꽉찬 상태이므로 예외처리한다.
	// 여기서 예외처리의 if문의 조건에 대해서, (정상적인 경우에) ptr==max로도 충분히 예외처리를 할 수 있다.
	// 그러나 프로그래밍 실수 혹은 모종의 다른 이유로 ptr값이 잘못될 수 있으므로 >=를 사용하는게 프로그램의 안정성을 높일 수 있는 방향이다.
	
	public int pop() throws EmptyIntStackException{
		if(ptr<=0) {
			throw new EmptyIntStackException();
		}
		return stk[--ptr];
	}
	// 스택의 꼭대기에서 데이터를 제거하고 그 값을 반환하는 메서드 pop이다.
	
	public int peek() throws EmptyIntStackException{
		if(ptr<=0) {
			throw new EmptyIntStackException();
		}
		return stk[ptr-1];
	}
	// pop이나 push는 스택포인터 ptr의 값을 직접적으로 변경을 하면서 데이터를 꺼내거나 넣는데, peek는 현재 스택의 맨위에 있는 데이터를 보기만 한다(ptr-1) 
	
	public int indexOf(int x) {
		for(int i= ptr-1; i>=0; i--) {
			if(stk[i] == x) {
				return i;
			}
		}
		return -1;
	}
	// 스택의 요소를 검색하여 배열의 인덱스를 리턴하는 indexOf다. for문을 배열 stk의 길이만큼 돌리는것이 아니라, 스택의 꼭대기부터 검색한다
	
	public void clear() {
		ptr = 0;
	}
	// 스택 비우기
	
	public int capacity() {
		return max;
	}
	// 스택의 용량을 반환
	
	public int size() {
		return ptr;
	}
	// 현재 스택에 쌓여있는 데이터 수 반환
	
	public boolean isEmpty() {
		return ptr<=0;
	}
	// 스택이 비었는지 반환
	
	public boolean isFull() {
		return ptr>=max;
	}
	// 스택이 가득찼는지 반환
	
	public void dump() {
		if(ptr<=0) {
			System.out.println("스택이 비어있습니다.");
		}else {
			for(int i = 0; i<ptr; i++) {
				System.out.print(stk[i]+" ");
			}
			System.out.println();
		}
	}
	// 스택 안의 모든 데이터를 표시해주는 메서드 dump(바닥에서 꼭대기 순서로)
}
