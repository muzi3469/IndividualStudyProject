package study20180913;

import java.util.*;

/***
 * 완성
 * @author itbank
 *
 */
public class Calendar2016 {
	public static void main(String[] args) {
		CalSolution cs = new CalSolution();
		System.out.println(cs.solution(5, 24));
	}
}

class CalSolution {
	public String solution(int a, int b) {
		//a -> 월, b-> 일
		final String[] DAY_OF_WEEK = {"", "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		String answer = "";
		Calendar cal = Calendar.getInstance();
//		cal.set(Calendar.YEAR, 2016);
		cal.set(2016, a-1, b);
		answer = DAY_OF_WEEK[cal.get(Calendar.DAY_OF_WEEK)];
		return answer;
	}
}
