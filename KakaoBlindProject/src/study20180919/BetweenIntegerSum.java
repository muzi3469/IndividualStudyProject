package study20180919;

public class BetweenIntegerSum {
	public static void main(String[] args) {
		BIntegserSumSolution s = new BIntegserSumSolution();
	}
}

class BIntegserSumSolution {
	public long solution(int a, int b) {
		long answer = 0;
		if(a<=b)
			for(int i=a; i<=b; i++)
				answer+=i;
		else
			for(int i=b; i<=a; i++)
				answer+=i;
		return answer;
	}
}