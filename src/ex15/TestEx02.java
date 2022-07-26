package ex15;

import java.util.Arrays;

/*
	배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.
	
	예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면
	
	array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
	1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
	2에서 나온 배열의 3번째 숫자는 5입니다.
	배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때, commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록 solution 함수를 작성해주세요.
	
	제한사항
	array의 길이는 1 이상 100 이하입니다.
	array의 각 원소는 1 이상 100 이하입니다.
	commands의 길이는 1 이상 50 이하입니다.
	commands의 각 원소는 길이가 3입니다.
	입출력 예
	array	commands	return
	[1, 5, 2, 6, 3, 7, 4]	[[2, 5, 3], [4, 4, 1], [1, 7, 3]]	[5, 6, 3]
	입출력 예 설명
	[1, 5, 2, 6, 3, 7, 4]를 2번째부터 5번째까지 자른 후 정렬합니다. [2, 3, 5, 6]의 세 번째 숫자는 5입니다.
	[1, 5, 2, 6, 3, 7, 4]를 4번째부터 4번째까지 자른 후 정렬합니다. [6]의 첫 번째 숫자는 6입니다.
	[1, 5, 2, 6, 3, 7, 4]를 1번째부터 7번째까지 자릅니다. [1, 2, 3, 4, 5, 6, 7]의 세 번째 숫자는 3입니다.
 */

public class TestEx02 {
	public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        // commands의 길이 = {2,5,3} {4,4,1} {1,7,3} -> 3
        
        for(int i=0; i<commands.length; i++){
        	// 처리해야될 commands의 갯수만큼 진행
        	int start = commands[i][0] -1;
		    int end = commands[i][1];
		    int k = commands[i][2]-1;
		    
		    int[] temp = new int[end-start];
		    // 복사해서 담아둘 배열 temp의 길이는 end-start로 자르는 부위만큼 길이를 설정
		    
		    for(int j=0; j<temp.length; j++) {
		    	temp[j] = array[start++]; 
		    }
		    // temp에 array의 start부터 담아 복사한다.
		    // 이 과정은 Array.copyOfRange(배열,시작점, 끝점)을 이용해 할 수도 있다.
		    
		    for(int n = 1; n<temp.length; n++) {
		    	int m;
		    	int tmp = temp[n];
		    	for(m=n; m>0&&temp[m-1]>tmp;m--) {
		    		temp[m] = temp[m-1];
		    	}
		    	temp[m] = tmp;
		    }
		    // 삽입정렬을 통해 정렬
		    
		    answer[i] = temp[k];
		    // 이후 정렬된 temp에서 k에 입력된 숫자로, 해당 위치(인덱스)에 있는 값을 읽어 정답 배열에 넣어준다.
		}
        return answer;
    }
	
	public static void main(String[] args) {
		int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
		int[] array = {1,5,2,6,3,7,4};
		
		int[] answer = solution(array, commands);
		for(int i=0; i<answer.length; i++) {
			System.out.print(answer[i]+" ");
		}
		
	}
}
