package ex17;
import java.util.ArrayList;
import java.util.Comparator;

public class TestEx13 {
	
	public static int[] solution(int[] arr, int divisor) {
		int[] answer = {-1};
	    ArrayList<Integer> al = new ArrayList<Integer>();
	    for(int i=0; i<arr.length; i++){
	    	if(arr[i]%divisor==0){
	    		al.add(arr[i]);
	    	}
	    }
	    al.sort(Comparator.naturalOrder());
	    if(al.size()!=0){
	    	answer = new int[al.size()];
	    	for(int i=0; i<answer.length; i++){
	    		answer[i] = al.get(i);
	    	}
	    }
	    return answer;
	}
	public static void main(String[] args) {
		int[] arr = {2,36,1,3};
		int divisor = 1;
		
		int[] answer = solution(arr,divisor);
		
		for(int i=0; i<answer.length; i++) {
			System.out.print(answer[i]+" ");
		}
		
	}
	    

}
