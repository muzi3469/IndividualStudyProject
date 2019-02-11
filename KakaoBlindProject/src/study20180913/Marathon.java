package study20180913;

import java.util.*;

/***
 * 완성은 했으나 효율성 떨어짐
 * @author itbank
 *
 */

public class Marathon {
	public static void main(String[] args) {
		MSolution ms = new MSolution();
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		System.out.println(ms.solution(participant, completion));
	}
}

class MSolution {
	public String solution(String[] participant, String[] completion) {
		// 참가자 배열				완주한 선수 명단
		String answer = "";
		//		ArrayList<String> marathon = new ArrayList<>();
		//		Collections.addAll(marathon, participant);
		//		for(int i=0; i<completion.length; i++) {
		//			if(marathon.contains(completion[i])) {
		//				marathon.remove(marathon.indexOf(completion[i]));
		//			}
		//		}
		//		answer = marathon.get(0);
		HashMap<String, Integer> marathon = new HashMap<>();
		int samePersonCnt = 0;
		for(int i=0; i<participant.length; i++){
			if(marathon.containsKey(participant[i])) {
				marathon.put(participant[i], marathon.get(participant[i])+1);
				samePersonCnt++;
			}
			else
				marathon.put(participant[i], 1);
		}

		for(int i=0; i<completion.length; i++) {
			if(marathon.get(completion[i])-1 == 0)
				marathon.remove(completion[i]);
			else {
				marathon.put(completion[i], marathon.get(completion[i])-1);
				samePersonCnt--;
			}
		}
		Iterator<String> it = marathon.keySet().iterator();
		answer = it.next();

		return answer;
	}
}
