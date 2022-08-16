package ex16;
/*

Design a data structure that can, efficiently with respect to time used, store and check if the total of any three successively added elements is equal to given total.

For example, new MovingTotal() creates an empty container with no existing totals append({1,2,3,4}) 
appends elements  {1,2,3,4}, which means that there are two existing totals (1+2+3 =6 and 2+3+4 =9).
append({5}) appends element 5 and creates an additional total from {3,4,5}. There would now be three totals (1+2+3 =6, 2+3+4=9, 3+4+5=12). 
At this point contains(6), contains(9), and contains(12) should return true, while contains(7) should return false

연속적으로 추가된 세 요소의 총합이 주어진 총합과 동일한지 여부를 효율적으로 저장하고 확인할 수 있는 데이터 구조를 설계한다.

예를 들어 new MovingTotal()은 기존 총계가 추가되지 않은 빈 컨테이너를 생성합니다. 
즉, 기존 총계(1+2+3 = 6 및 2+3+4 = 9). 추가 요소 5가 추가되고 {3,4,5}에서 추가 총계가 생성됩니다. 
이제 총계는 3개(1+2+3=6, 2+3+4=9, 3+4+5=12)가 된다. 
이때 contains(6), contains(9) 및 contains(12)는 true를 반환하고 contains(7)는 false를 반환해야 합니다.
 */

import java.util.ArrayList;

/*
Adds/appends list of integers at the end of internal list.

Returns boolean representing if any three consecutive integers in the internal list have given total.

내부 목록 끝에 정수 목록을 추가하거나 추가합니다.

내부 목록에 있는 세 개의 연속된 정수가 총계를 지정했는지 여부를 나타내는 부울을 반환합니다.

 */
public class MovingTotal {
    /**
     * Adds/appends list of integers at the end of internal list.
     */
	
	public static ArrayList<Integer> intList = new ArrayList<Integer>();
    public void append(int[] list) {
        //throw new UnsupportedOperationException("Waiting to be implemented.");
    	
    	for(int i=0; i<list.length; i++) {
    		intList.add(list[i]);
    	}
    }

    /**
     * Returns boolean representing if any three consecutive integers in the
     * internal list have given total.
     */
    public boolean contains(int total) {
        //throw new UnsupportedOperationException("Waiting to be implemented.");
    	boolean answer = false;
    	int i = 0;
    	int length = intList.size();
    	
    	while(!answer && i<length-2) {
    		int sum = 0;
    		System.out.println("i : " + i);
    		sum += intList.get(i);
    		sum += intList.get(i+1);
    		sum += intList.get(i+2);
    		if(total == sum) {
    			answer = true;
    		}
    		System.out.println("answer : " + answer);
    		i++;
    		
    	}
    	
//    	for(int i=0; i<intList.size()-2;i++) {
//    		int sum = 0;
//    		for(int j=i; j<=i+2; j++) {
//    			sum += intList.get(j);
//    		}
//    		if(sum==total) {
//    			answer = true;
//    		}
//    	}
    	return answer;
    }

    public static void main(String[] args) {
        MovingTotal movingTotal = new MovingTotal();

        movingTotal.append(new int[] { 1, 2, 3, 4 });

        System.out.println(movingTotal.contains(6));
        System.out.println(movingTotal.contains(9));
        System.out.println(movingTotal.contains(12));
        System.out.println(movingTotal.contains(7));

        movingTotal.append(new int[] { 5 });

        System.out.println(movingTotal.contains(6));
        System.out.println(movingTotal.contains(9));        
        System.out.println(movingTotal.contains(12));
        System.out.println(movingTotal.contains(7));
    }
}
