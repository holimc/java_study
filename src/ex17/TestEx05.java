package ex17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/*
신고 결과 받기
신입사원 무지는 게시판 불량 이용자를 신고하고 처리 결과를 메일로 발송하는 시스템을 개발하려 합니다. 무지가 개발하려는 시스템은 다음과 같습니다.

각 유저는 한 번에 한 명의 유저를 신고할 수 있습니다.
신고 횟수에 제한은 없습니다. 서로 다른 유저를 계속해서 신고할 수 있습니다.
한 유저를 여러 번 신고할 수도 있지만, 동일한 유저에 대한 신고 횟수는 1회로 처리됩니다.
k번 이상 신고된 유저는 게시판 이용이 정지되며, 해당 유저를 신고한 모든 유저에게 정지 사실을 메일로 발송합니다.
유저가 신고한 모든 내용을 취합하여 마지막에 한꺼번에 게시판 이용 정지를 시키면서 정지 메일을 발송합니다.
다음은 전체 유저 목록이 ["muzi", "frodo", "apeach", "neo"]이고, k = 2(즉, 2번 이상 신고당하면 이용 정지)인 경우의 예시입니다.

유저 ID		유저가 신고한 ID	설명
"muzi"		"frodo"			"muzi"가 "frodo"를 신고했습니다.
"apeach"	"frodo"			"apeach"가 "frodo"를 신고했습니다.
"frodo"		"neo"			"frodo"가 "neo"를 신고했습니다.
"muzi"		"neo"			"muzi"가 "neo"를 신고했습니다.
"apeach"	"muzi"			"apeach"가 "muzi"를 신고했습니다.
각 유저별로 신고당한 횟수는 다음과 같습니다.

유저 ID		신고당한 횟수
"muzi"		1
"frodo"		2
"apeach"	0
"neo"		2
위 예시에서는 2번 이상 신고당한 "frodo"와 "neo"의 게시판 이용이 정지됩니다. 이때, 각 유저별로 신고한 아이디와 정지된 아이디를 정리하면 다음과 같습니다.

유저 ID		유저가 신고한 ID		정지된 ID
"muzi"		["frodo", "neo"]	["frodo", "neo"]
"frodo"		["neo"]				["neo"]
"apeach"	["muzi", "frodo"]	["frodo"]
"neo"		없음					없음
따라서 "muzi"는 처리 결과 메일을 2회, "frodo"와 "apeach"는 각각 처리 결과 메일을 1회 받게 됩니다.

이용자의 ID가 담긴 문자열 배열 id_list, 각 이용자가 신고한 이용자의 ID 정보가 담긴 문자열 배열 report, 정지 기준이 되는 신고 횟수 k가 매개변수로 주어질 때, 각 유저별로 처리 결과 메일을 받은 횟수를 배열에 담아 return 하도록 solution 함수를 완성해주세요.

제한사항
2 ≤ id_list의 길이 ≤ 1,000
1 ≤ id_list의 원소 길이 ≤ 10
id_list의 원소는 이용자의 id를 나타내는 문자열이며 알파벳 소문자로만 이루어져 있습니다.
id_list에는 같은 아이디가 중복해서 들어있지 않습니다.
1 ≤ report의 길이 ≤ 200,000
3 ≤ report의 원소 길이 ≤ 21
report의 원소는 "이용자id 신고한id"형태의 문자열입니다.
예를 들어 "muzi frodo"의 경우 "muzi"가 "frodo"를 신고했다는 의미입니다.
id는 알파벳 소문자로만 이루어져 있습니다.
이용자id와 신고한id는 공백(스페이스)하나로 구분되어 있습니다.
자기 자신을 신고하는 경우는 없습니다.
1 ≤ k ≤ 200, k는 자연수입니다.
return 하는 배열은 id_list에 담긴 id 순서대로 각 유저가 받은 결과 메일 수를 담으면 됩니다.

 */

public class TestEx05 {
	public static int[] solution(String[] id_list, String[] report, int k) {
		// report에서 한 유저가 같은 유저를 여러번 신고한걸 제외해야함 
		// k 이상 신고당한 유저 찾기
		// 정지된 유저를 신고했던 유저에게 보내야하는 메일 갯수 새기 (answer 작성)
		
		HashMap<String, Integer> reportCnt = new HashMap<String, Integer>();
		// 신고된 유저(String)과 신고된 횟수(Integer)를 담을 hashmap
		HashMap<String, ArrayList<String>> reportMap = new HashMap<String, ArrayList<String>>();
		// 신고된 유저(String)과 신고한 유저 리스트(ArrayList)를 담을 hashmap
		int[] answer = new int[id_list.length];
		
		for(int i=0; i<report.length; i++) {
			String[] strArr = report[i].split(" ");
			// strArr[0] = 신고자 / strArr[1] = 신고된사람
			if(reportMap.get(strArr[1]) == null) {
				// 새롭게 신고된 사람을 추가
				reportMap.put(strArr[1], new ArrayList<String>(Arrays.asList(strArr[0])));
				reportCnt.put(strArr[1], 1);
			}else {
				// 신고된 사람이 이미 map에 있을때
				if(reportMap.get(strArr[1]).indexOf(strArr[0])<0) {
					// map.get으로 arraylist를 가져오고, 해당 리스트에서 신고한사람이 없을경우 (신규신고)를 찾기위해 indexOf를 쓴다. 해당 인덱스가 없다면 -1을 리턴하기 때문
					reportMap.get(strArr[1]).add(strArr[0]);
					reportCnt.put(strArr[1], reportCnt.get(strArr[1])+1);
				}
			}
			
		}
		
		for(int n=0; n<id_list.length; n++) {
			if(reportCnt.getOrDefault(id_list[n], 0)>=k) {
				// getOrDefault로 key값이 존재하지 않는다면 디폴트값(0)을 리턴, k와 비교해 정지 기준을 넘는 유저를 추출
				for(int m=0; m<id_list.length; m++) {
					if(reportMap.get(id_list[n]).contains(id_list[m])) {
						answer[m]++;
					}
				}
				
			}
		}
		
	    return answer;
	}
	
	public static void main(String[] args) {
		String[] id_lists = {"muzi", "frodo", "apeach", "neo"};
		// 유저 아이디 리스트
		String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		// 유저아이디 + 신고대상 
		int k = 2;
		// k회 신고누적시 제재
		
		int[] answer = solution(id_lists, report, k);
		// 아이디 리스트에 맞춰서 결과통보 메일의 갯수를 담아서 오는 배열 answer
		
		for(int i=0; i<answer.length; i++) {
			System.out.print(answer[i] + " ");
		}
	}

}