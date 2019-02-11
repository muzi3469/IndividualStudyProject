package study20181010;

import java.util.*;

public class DevelopmentService {
	public static void main(String[] args) {
		DServiceSolution ds = new DServiceSolution();
		int[] progresses = {93,30,55};
		int[] speeds = {1,30,5};
		System.out.println(Arrays.toString(ds.solution(progresses, speeds)));
	}
}

class DServiceSolution {
	public int[] solution(int[] progresses, int[] speeds) {
		int[] answer;
		ArrayList<Integer> days = new ArrayList<>();
		for(int i=0; i<progresses.length; i++) {
			if((100-progresses[i])%speeds[i] != 0)
				days.add(((100-progresses[i])/speeds[i]) + 1);
			else
				days.add((100-progresses[i])/speeds[i]);
		}

		ArrayList<Integer> result = new ArrayList<>();
		int maxDay = days.get(0);
		int count = 0;
		for(int i=0; i<days.size(); i++) {
			if(maxDay >= days.get(i))
				count++;
			if((i+1) < days.size()) {
				if(maxDay < days.get(i+1)) {
					maxDay = days.get(i+1);
					result.add(count);
					count=0;
				}
			} else {
				result.add(count);
			}
		}
//		System.out.println(days);
//		System.out.println(result);
		
		answer = new int[result.size()];
		for(int i=0; i<result.size(); i++)
			answer[i] = result.get(i);
		return answer;
	}
}