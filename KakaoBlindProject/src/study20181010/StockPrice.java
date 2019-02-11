package study20181010;

import java.util.*;

public class StockPrice {
	public static void main(String[] args) {
		SPriceSolution ss = new SPriceSolution();
		int[] prices = {498,501,470,489};
		System.out.println(Arrays.toString(ss.solution(prices)));
	}
}

class SPriceSolution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        int length = prices.length;
        
        int time = 0;
        for(int i=0; i<length; i++) {
        	if(i == length-1)
        		answer[i] = 0;
        	for(int j=i; j<length; j++) {
        		if(prices[i] <= prices[j])
        			time++;
        		else 
        			break;
        	}
        	answer[i] = time;
        	time = 0;
        }
        
        answer[length-2]--;
        answer[length-1]--;
        
        return answer;
    }
}