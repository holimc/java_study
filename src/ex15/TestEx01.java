package ex15;

import java.util.ArrayList;

/* 
	배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다. 이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다. 단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다. 예를 들면,
	arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
	arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.
	배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수를 완성해 주세요.

	제한사항
	배열 arr의 크기 : 1,000,000 이하의 자연수
	배열 arr의 원소의 크기 : 0보다 크거나 같고 9보다 작거나 같은 정수
 */

public class TestEx01 {
	public static int[] solution(int[] arr) {
		ArrayList<Integer> answerList = new ArrayList<Integer>();
		// 배열의 크기를 정확하게 짚기 힘드므로 ArrayList를 사용한다. 
		int value = -1;
		// arr의 원소의 크기는 0보다 크거나 같고, 9보다 작거나 같은 정수이므로 비교값을 -1로 쓴다
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != value) {
				// 이전과 같지 않은 값인지 확인 
				answerList.add(arr[i]);
				value = arr[i];
				// 연속되는 값이 아니므로 value를 갱신한다.
			}
		}
		int[] answer = new int [answerList.size()];
		for(int j=0; j<answer.length; j++) {
			answer[j] = answerList.get(j);
		}
		
		
		return answer;
		/*
		 * return answerList.stream().mapToInt(i->i).toArray();
		 * 위의 배열을 만들어 리스트의 내용물을 옮겨닮는 기능을 한줄로 쓴 코드다
		 * 리스트를 스트림 기능을 사용해서 바꾼다. 스트림을 int 스트림으로 변경후, 배열로 변환 
		 */
	}
	
	public static void main(String[] args) {
		int[] arr = {1,1,3,3,0,1,1};
		int[] ans = solution(arr);
		for(int i=0; i<ans.length; i++) {
			System.out.print(ans[i]+" ");
		}
		
	}

}
