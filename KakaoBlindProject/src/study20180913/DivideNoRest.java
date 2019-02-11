package study20180913;

import java.util.*;

/***
 * 완성은 했으나 효율성 떨어짐
 * @author itbank
 *
 */

public class DivideNoRest {
	public static void main(String[] args) {
		DNRSolution ds = new DNRSolution();
		int[] arr = {5, 9, 7, 10};
		System.out.println(Arrays.toString(ds.solution(arr, 5)));
	}
}
class DNRSolution {
	public int[] solution(int[] arr, int divisor) {
		int[] answer;
		HashSet<Integer> hsArr = new HashSet<>();
		for(int i=0; i<arr.length; i++)
			hsArr.add(arr[i]);
		
		for(int i=0; i<arr.length; i++)
			if(arr[i]%divisor!=0)
				hsArr.remove(arr[i]);
		
		if(hsArr.size()==0) {
			answer = new int[1];
			answer[0] = -1;
			return answer;
		}
		
		answer = new int[hsArr.size()];
		Iterator<Integer> it = hsArr.iterator();
		int i=0;
		while(it.hasNext())
			answer[i++] = it.next(); 
		
		return answer;
	}
}
