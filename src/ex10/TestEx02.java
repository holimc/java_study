package ex10;

// 하나의 배열을 공유하여 2개의 스택을 구현하는 int형 데이터용 스택클래스를 만드세요.
// 스택에 저장하는 데이터는 int값이고, 스택A는 배열의 시작부분이 스택의 바닥이고 스택 B는 배열의 끝부분이 스택의 바닥입니다.
/*
 *  [ | | | | | | | | | | | | | | | | | | | | ] 
 *  <--------------->           <------------->
 *  (바닥) 스택 A (꼭대기)          (꼭대기)스택B(바닥)
 */

public class TestEx02 {
	private int max;
	private int ptrA;
	private int ptrB;
	private int[] stk;
	
	public enum AorB{
		StackA,StackB;
	}
	// 열거체를 이용해 두개의 스택을 정의 
	
	public class EmptyIntStackXException extends RuntimeException {
		public EmptyIntStackXException() {
		}
	}

	public class OverflowIntStackXException extends RuntimeException {
		public OverflowIntStackXException() {
		}
	}
	
	public TestEx02(int capacity){
		ptrA = 0;
		// 포인트 초기화, 바닥이므로 배열의 첫부분(0) 
		ptrB = capacity -1;
		// 포인트 초기화, B의 바닥은 배열의 끝부분이므로 입력값의 -1
		max = capacity;
		try {
			stk = new int[max];
		}catch(OutOfMemoryError e) {
			max = 0;
		}
	}
	
	public int push(AorB sw, int x) throws OverflowIntStackXException{
		if(ptrA>=ptrB+1) {
			throw new OverflowIntStackXException();
		}
		// 원래의 스택에서는 ptr과 max를 비교해서 배열의 크기를 넘으면 오버플로우 에러를 띄웠다.
		// 그러나 해당 문제는 양끝에서 스택을 만드는 상황이므로 서로의 스택 포인터를 비교한다.
		// 이 과정에서 한방향의 스택에서 스택포인터에 -1 해서 비교하거나 값을 불러오던 부분이, 이 경우는 ptrB는 역이므로 +1을 해서 비교한다. 
		switch(sw) {
		case StackA :
			stk[ptrA++] = x;
			break;
		case StackB :
			stk[ptrB--] = x;
			break;
		}
		// 두 스택을 열거체로 담고있는 AorB를 사용해 switch로 어느쪽 스택을 호출할지 확인한다.
		return x;
	}
	
	public int pop(AorB sw) throws EmptyIntStackXException{
		int x = 0;
		switch(sw) {
		case StackA :
			if(ptrA<=0) {
				throw new EmptyIntStackXException();
			}
			x = stk[--ptrA];
			break;
		case StackB :
			if(ptrB>=max -1) {
				throw new EmptyIntStackXException();
			}
			x = stk[++ptrB];
			break;
		}
		return x;
	}
	public int peek(AorB sw) throws EmptyIntStackXException{
		int x = 0;
		switch(sw) {
		case StackA :
			if(ptrA<=0) {
				throw new EmptyIntStackXException();
			}
			x = stk[ptrA-1];
			break;
		case StackB :
			if(ptrB>=max-1) {
				throw new EmptyIntStackXException();
			}
			x = stk[ptrB+1];
			break;
		}
		return x;
	}
	public int indexOf(AorB sw, int x) {
		
		switch(sw) {
		case StackA :
			for(int i=ptrA-1;i>=0; i--) {
				if(stk[i] == x) {
					return i;
				}
			}
			break;
		case StackB :
			for(int i=ptrB+1; i<max; i++) {
				if(stk[i] == x) {
					return i;
				}
			}
			break;
		}
		
		return -1;
	}
	
	public void clear(AorB sw){
		switch(sw) {
		case StackA :
			ptrA = 0;
			break;
		case StackB :
			ptrB = max-1;
			break;
		}
	}
	
	public int capacity() {
		return max;
	}
	
	public int size(AorB sw){
		switch(sw) {
		case StackA :
			return ptrA;
		case StackB :
			return ptrB;
		}
		return 0;
	}
	
	public boolean isEmpty(AorB sw) {
		switch(sw) {
		case StackA :
			return ptrA<=0;
		case StackB :
			return ptrB>=max-1;
		}
		return true;
	}
	
	public boolean isFull() {
		return ptrA >= ptrB+1;
	}
	
	public void dump(AorB sw) {
		switch(sw) {
		case StackA :
			if(ptrA<=0) {
				System.out.println("스택이 비었습니다.");
			}else {
				for(int i=0; i<ptrA; i++) {
					System.out.print(stk[i]+ " ");
				}
				System.out.println();
			}
			break;
		case StackB :
			if(ptrB>=max-1) {
				System.out.println("스택이 비었습니다.");
			}else {
				for(int i=max-1; i>ptrB; i--) {
					System.out.print(stk[i] + " ");
				}
				System.out.println();
			}
			break;
		}
	}
}
