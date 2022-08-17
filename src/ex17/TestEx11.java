package ex17;
/*
 * 제일 작은 수 제거하기
 * 정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요. 
 * 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 
 * 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
 */

import java.util.ArrayList;

public class TestEx11 {
	public static int[] solution(int[] arr) {
		if(arr.length == 1) {
			int[] answer = {-1};
			return answer;
		}
		int[] answer = new int[arr.length-1];
		
		int min = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(min>arr[i]) {
				min = arr[i];
			}
		}
		int index = 0;
		for(int n=0; n<arr.length;n++) {
			if(arr[n] == min) {
				continue;
			}
			answer[index++] = arr[n];
		}
		
		/*
		if(arr.length != 1) {
			ArrayList al = new ArrayList();	
			int min = arr[0];
			// 최저값을 구하고 걔 빼고 다 al에 넣어버리기
			for(int i=1; i<arr.length; i++) {
				if(min>arr[i]) {
					al.add(min);
					min = arr[i];
				}else {
					al.add(arr[i]);
				}
			}
			answer = new int [al.size()];
			for(int n=0; n<answer.length; n++) {
				answer[n] = (int) al.get(n);
			}
		}
		
		위의 방식으로 하면 제일 작은수가 여러개일때 안빠진다.
		*/
		
		
	    return answer;
	}
	
	public static void main(String[] args) {
		int[] arr = {3,2,4,5,8,7,6,9};
		int[] answer = solution(arr);
		
		for(int i=0; i<answer.length; i++) {
			System.out.print(answer[i]+" ");
		}
	}

}
