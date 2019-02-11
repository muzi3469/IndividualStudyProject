package study20180910;

import java.util.Arrays;

public class SecretMap {
	public static void main(String[] args) {
		SMSolution sms = new SMSolution();
		int n = 5;
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};
		System.out.println(Arrays.toString(sms.solution(n, arr1, arr2)));
	}
}

class SMSolution {
	public String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		String[] str1 = new String[n];
		String[] str2 = new String[n];

		for(int i=0;i<n;i++) {
			str1[i] = Integer.toBinaryString(arr1[i]);
			str2[i] = Integer.toBinaryString(arr2[i]);

			if(str1[i].length() < n) {
				int len = str1[i].length();
				for(int j=0;j<n-len; j++)
					str1[i] = "0"+str1[i];
			}
			if(str2[i].length() < n) {
				int len = str2[i].length();
				for(int j=0;j<n-len; j++)
					str2[i] = "0"+str2[i];
			}
			str1[i] = str1[i].replace('1', '#');
			str1[i] = str1[i].replace('0', ' ');
			str2[i] = str2[i].replace('1', '#');
			str2[i] = str2[i].replace('0', ' ');
		}
		for(int i=0;i<n;i++)
			answer[i]="";

		for(int i=0; i<n; i++) {
			for(int j=0;j<n;j++) {
				if(str1[i].charAt(j)=='#' || str2[i].charAt(j)=='#')
					answer[i] += '#';
				else
					answer[i] += ' ';
				
			}
		}

		return answer;
	}
}
