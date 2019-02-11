package study20180928;

import java.util.*;

/**
 * 프로그래머스 --> 더 맵게
 * 몇개의 테스트케이스가 틀리는데 이유를 모르겠음 ....
 * @author Choi
 *
 */

public class MoreHot {
	public static void main(String[] args) {
		MHotSolution mh = new MHotSolution();
		int[] scoville = {1,2,3,9,10,12};
		int K = 7;
		System.out.println(mh.solution(scoville, K));
	}
}
class MHotSolution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(
        		new Comparator<Integer>() {
					@Override
					public int compare(Integer o1, Integer o2) {
						// TODO Auto-generated method stub
						return o1.compareTo(o2);
					}
				});
        for(int i=0; i<scoville.length; i++) {
        	if(scoville[i] < K)
        		pq.add(scoville[i]);
        }
        
        if(pq.size() == 1)
        	return -1;
        else if(pq.size() == 0)
        	return 0;
        
        System.out.println(pq);
        while(true) {
        	int result = pq.poll() + pq.poll()*2;
        	if(result < K)
        		pq.add(result);
        	answer++;
        	System.out.println(pq +", "+ result + ", " + answer);
        	if(pq.size()==0)
        		break;
        	else if(pq.size() == 1)
            	return -1;
        }
        
        return answer;
    }
}