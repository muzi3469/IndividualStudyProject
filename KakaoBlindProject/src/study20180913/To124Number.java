package study20180913;

/***
 * 완성
 * @author itbank
 *
 */
public class To124Number {
	public static void main(String[] args) {
		To124Solution tn = new To124Solution();
		System.out.println(tn.solution(10));
	}
}

class To124Solution {
	public String solution(int n) {
		String answer = "";
		char[] restChar = {'1','2','4'};
		int rest;
		
		while(true) {
			n = n-1;
			answer = restChar[n%3]+answer;
			n /= 3;
			if(n==0)
				break;
		}
		return answer;
	}
}
