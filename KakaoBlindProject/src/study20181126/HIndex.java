package study20181126;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 
 * @author Choi
 *	완성을 못함 ㅅㅂ 뭔소린지도 모르겠음
 */
public class HIndex {
	public static void main(String[] args) {
		int[] citations = {3,0,6,1,5};
		HISolution hi = new HISolution();
		System.out.println(hi.solution(citations));
	}
}

class HISolution {
	/*
	 * n : 논문 몇편
	 * h : 몇편의 인용, 인용된 횟수
	 * h번 이상 인용된 논문이 h편이상이어야 한다.
	 */
    public int solution(int[] citations) {
        int answer = 0;
        
        List<Integer> list = Arrays.stream(citations).boxed().collect(Collectors.toList());
        ArrayList<Integer> arr = new ArrayList<>(list);
        
        Collections.sort(arr, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1-o2;
			}
		});
        
        System.out.println(arr);
        
        int n = arr.size();
        for(int i=0; i<n; i++) {
        	if(arr.get(i)==(n-i)) {
        		answer = arr.get(i);
        		break;
        	} else if(arr.get(i)>(n-i)) {
        		answer = arr.get(i);
        		break;
        	}
        }
        
        return answer;
    }
}
