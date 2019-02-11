package study20180918;

import java.util.*;

public class DevelopArchitect {
	public static void main(String[] args) {
		DArchitectSolution ds = new DArchitectSolution();
		int[] progresses = {93,30,55};
		int[] speeds = {1,30,5};
		System.out.println(Arrays.toString(ds.solution(progresses, speeds)));
	}
}

class DArchitectSolution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        int len = progresses.length;
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> minDayArr = new ArrayList<>();
        int day=0;
        for(int i=0; i<len; i++) {
        	day = (100-progresses[i])/speeds[i];
        	if((100-progresses[i])%speeds[i] != 0)
        		day++;
        	minDayArr.add(day);
        	System.out.println(day);
        }
        
        System.out.println(minDayArr);
        int min = minDayArr.get(0);
        int count;
        for(int i=0; i<len; i++) {
        	if(min < minDayArr.get(i))
        		min = minDayArr.get(i);
        	count=0;
        	for(int j=i+1; j<len; j++) {
        		if(min >= minDayArr.get(j))
        			count++;
        	}
        }
        
        return answer;
    }
}
