package study20180910;

public class NDegreeGame {
	public static void main(String[] args) {
		NDGSolution game = new NDGSolution();
		System.out.println(game.solution(16, 16, 2, 1));
	}
}

class NDGSolution {
	/**
	 * 
	 * @param n : 몇 진수, (2~16)
	 * @param t : 미리 구할 숫자의 갯수, answer의 길이
	 * @param m : 게임에 참가하는 인원
	 * @param p : 튜브의 순서
	 * @return
	 */
	public String solution(int n, int t, int m, int p) {
		String answer = "";
		String number = "";
		for(int i=0; i<=m*t; i++) {
			int tmp = i;
			String strTmp="";
			while(true) {
				if(tmp%n > 9) {
					strTmp = (char)('A'+(tmp%n-10))+strTmp;
				}
				else
					strTmp = tmp%n+strTmp;
				tmp /= n;
				if(tmp==0)
					break;
			}
			number += strTmp;
		}
		
		for(int i=0; i<t;i++) {
			answer += number.charAt(p-1);
			p += m;
		}
		
		return answer;
	}
}
