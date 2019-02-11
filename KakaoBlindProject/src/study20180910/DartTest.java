package study20180910;

public class DartTest {
	public static void main(String[] args) {
		Solution sol = new Solution();
		String[] test = {"1S2D*3T", "1D2S#10S", "1D2S0T","1D2S3T*"};
		String testStr = "1S2D*3T";
		for(int i=0;i<test.length;i++)
			System.out.println(sol.solution(test[i]));
	}
}

class Solution {
	public int solution(String dartResult) {
		int answer = 0;
		String[] resultStr = new String[3];
		int[] resultInt = new int[3];
		int intIndex = 0;
		int strIndex = 0;
		/**
		 * 아스키 코드 값
		 * 숫자 : 0~9 --> 49~57
		 * 알파벳 대문자 : A~Z -> 65~90
		 * * --> 34, # --> 35
		 */
		for(int i=0; i<dartResult.length();i++) {
			if(dartResult.charAt(i)<='9' && dartResult.charAt(i)>='0') {
				if(dartResult.charAt(i+1)<='9' && dartResult.charAt(i+1)>='0') {
					resultInt[intIndex++] = Integer.parseInt(dartResult.substring(i,i+2));
					i++;
				}
				else
					resultInt[intIndex++] = Integer.parseInt(dartResult.substring(i,i+1));
			}
			else if(dartResult.charAt(i)>='A' && dartResult.charAt(i)<='Z') {
				if(i<dartResult.length()-1) 
					if(dartResult.charAt(i+1) == '*' || dartResult.charAt(i+1)=='#') {
						resultStr[strIndex++] = dartResult.substring(i,i+2);
						i++;
					} else
						resultStr[strIndex++] = dartResult.substring(i,i+1);
				else if(i==dartResult.length()-1)
					resultStr[strIndex++] = dartResult.substring(i,i+1);
			}
		}

		for(int i=0; i<3;i++) {
			if(resultStr[i].charAt(0) == 'T')
				resultInt[i] = (int)Math.pow(resultInt[i], 3);
			else if(resultStr[i].charAt(0) == 'D')
				resultInt[i] = (int)Math.pow(resultInt[i], 2);

			if(resultStr[i].length()==2) {
				if(resultStr[i].charAt(1) == '*') {
					if(i!=0) 
						resultInt[i-1] *= 2;
					resultInt[i] *=2;
				}
				else if(resultStr[i].charAt(1) == '#')
					resultInt[i] *= (-1);
			}
		}

		for(int i=0;i<3;i++)
			answer += resultInt[i];

		return answer;
	}
}