package study20180917;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Top {
	public static void main(String[] args) {
		TSolution ts = new TSolution();
		int[] heights = {3,9,9,3,5,7,2};
		System.out.println(Arrays.toString(ts.solution(heights)));
	}
}

class TSolution {
    public int[] solution(int[] heights) {
        int[] answer = new int[heights.length];
        ArrayList<Integer> arrHeight = new ArrayList<>();
        int cnt = heights.length;
        int indexOfEnd = cnt-1;
        int maxHeight = 0;
        for(int i=0; i<cnt; i++)
        	arrHeight.add(heights[i]);
        for(int i=0; i<cnt; i++)
        	answer[i] = 0;
        System.out.println(arrHeight.get(indexOfEnd-1));
        
        for(int i=indexOfEnd; i>=0; i--) {
        	maxHeight = arrHeight.get(i);
        	for(int j=i-1; j>=0; j--) {
        		if(maxHeight<arrHeight.get(j)) {
        			answer[i] = j+1;
        			break;
        		}
        	}
        }
        
        return answer;
    }
}
