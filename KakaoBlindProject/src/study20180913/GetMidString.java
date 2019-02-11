package study20180913;

public class GetMidString {
	public static void main(String[] args) {
		GMSSolution gm = new GMSSolution();
		String s = "abcd";
		System.out.println(gm.solution(s));
	}
}
class GMSSolution {
	public String solution(String s) {
		String answer = "";
		if(s.length()%2==0) {
			answer = s.substring(s.length()/2-1, s.length()/2+1);
		} else {
			answer = s.substring(s.length()/2, s.length()/2+1);
		}
		return answer;
	}
}