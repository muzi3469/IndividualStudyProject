package study20180910;

import java.util.*;

public class LZW {
	public static void main(String[] args) {
		LZWSolution lzw = new LZWSolution();
//		lzw.solution("TOBEORNOTTOBEORTOBEORNOT");
//		lzw.solution("KAKAO");
		lzw.solution("ABABABABABABABAB");
	}
}

class LZWSolution {
	public int[] solution(String msg) {
		int[] answer;
		ArrayList<String> lzw = new ArrayList<>();
		ArrayList<Integer> printNum = new ArrayList<>();
		
		for(int i='A'; i<='Z'; i++) 
			lzw.add((char)i+"");
		
		for(int i=0;i<msg.length();i++) {
			String tmp="";
			for(int j=i; j<msg.length(); j++) {
				tmp += msg.charAt(j);
				System.out.println(tmp);
				if(!lzw.contains(tmp)) {
					lzw.add(tmp);
					printNum.add(lzw.indexOf(tmp.substring(0, tmp.length()-1))+1);
					i=j-1;
					break;
				} else if(j==msg.length()-1) {
					printNum.add(lzw.indexOf(tmp)+1);
					i=msg.length()+1;
					System.out.println(tmp);
				}
				
			}
		}
		for (Integer i : printNum) {
			System.out.println(i);
		}
		answer = new int[printNum.size()];
		for(int i=0; i<answer.length;i++) {
			answer[i] = printNum.get(i);
		}
		return answer;
	}
}
