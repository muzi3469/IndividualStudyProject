package study20180928;

import java.util.*;

public class MoreSpicy {
	public static void main(String[] args) {
		MSpicySolution ms = new MSpicySolution();
		int[] scoville = {1,2,3,9,10,12};
		int K = 7;
		System.out.println(ms.solution(scoville, K));
	}
}

class MSpicySolution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        List<Integer> beforeArr = new ArrayList<>();
        for(int i=0; i<scoville.length; i++) {
        	if(scoville[i] < K)
        		beforeArr.add(scoville[i]);
        }
        
        if(beforeArr.size() <= 1)
        	return -1;
        
        beforeArr = sortList(beforeArr);
        
        System.out.println(beforeArr);
        
        int keepCount = 0;
        while(true) {
        	List<Integer> sortedArr = new ArrayList<>();
        	sortedArr.add(beforeArr.get(0) + beforeArr.get(1)*2);
        	answer++;
        	
        	if(beforeArr.size() > 2)
        		for(int i=2; i<beforeArr.size(); i++)
        			sortedArr.add(beforeArr.get(i));
        	
        	sortedArr = sortList(sortedArr);
        	System.out.println(sortedArr);
        	for(int i=0; i<sortedArr.size(); i++)
        		if(sortedArr.get(i) >= K)
        			keepCount++;
        	
        	if(keepCount==sortedArr.size())
        		break;
        	
        	if(sortedArr.size()<2)
        		return -1;
        	
        	beforeArr = sortedArr;
        	keepCount=0;
        }
        
        return answer;
    }
    
    public List<Integer> sortList(List<Integer> list){
    	Collections.sort(list, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		});
    	
    	return list;
    }
}