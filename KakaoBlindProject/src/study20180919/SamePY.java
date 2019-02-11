package study20180919;

public class SamePY {
	public static void main(String[] args) {
		SPYSolution spy = new SPYSolution();
		String s ="pPoooyY";
		System.out.println(spy.solution(s));
	}
}
class SPYSolution {
    boolean solution(String s) {
        boolean answer = true;
        String str = s.toLowerCase();
        int pCount=0,yCount=0;
        for(int i=0; i<s.length(); i++) {
        	if(str.charAt(i) == 'p')
        		pCount++;
        	if(str.charAt(i) == 'y')
        		yCount++;
        }
        if(pCount == yCount)
        	answer = true;
        else
        	answer = false;
        
        return answer;
    }
}