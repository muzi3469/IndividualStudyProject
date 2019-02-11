package study20180913;

import java.util.*;

/***
 * 완성
 * @author itbank
 *
 */
public class HateSameNumber {
	public static void main(String[] args) {
		HSNSolution hs = new HSNSolution();
		int[] arr = {1,1,3,3,0,1,1};
		System.out.println(Arrays.toString(hs.solution(arr)));
	}
}

class HSNSolution {
	public int[] solution(int []arr) {
		int[] answer;
		ArrayList<Integer> newArr = new ArrayList<>();
		newArr.add(arr[0]);
		for(int i=1;i<arr.length;i++) {
			if(arr[i-1] == arr[i])
				continue;
			else
				newArr.add(arr[i]);
		}
		answer = new int[newArr.size()];
		Iterator<Integer> it = newArr.iterator();
		int i=0;
		while(it.hasNext()) 
			answer[i++] = it.next();
		
		return answer;
	}
}
