package study20180910;

import java.util.ArrayList;

public class NewsClustering {
	public static void main(String[] args) {
		String str1 = "handshake";
		String str2 = "shake hands";
		NewSolution  nS = new NewSolution();
		System.out.println(nS.solution(str1, str2));
	}
}

class NewSolution {
	public int solution(String str1, String str2) {
		int answer = 0;

		double tmp;
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		ArrayList<String> strArr1 = new ArrayList<>();
		ArrayList<String> strArr2 = new ArrayList<>();
		ArrayList<String> andArr = new ArrayList<>();

		for(int i=0; i<str1.length()-1;i++) 
			if(str1.charAt(i)>='a' && str1.charAt(i)<='z')
				if(str1.charAt(i+1)>='a' && str1.charAt(i+1)<='z')
					strArr1.add(str1.substring(i, i+2));
		for(int i=0; i<str2.length()-1;i++)
			if(str2.charAt(i)>='a' && str2.charAt(i)<='z')
				if(str2.charAt(i+1)>='a' && str2.charAt(i+1)<='z')
					strArr2.add(str2.substring(i, i+2));
		
		if(strArr1.size() ==0 && strArr2.size()==0)
			return 65536;
		
		for(int i=0; i<strArr1.size();i++) {
			for(int j=0; j<strArr2.size(); j++) {
				System.out.println(strArr1.get(i) + ", " + strArr2.get(j));
				if(strArr1.get(i).equals(strArr2.get(j))) {
					andArr.add(strArr1.get(i));
					strArr1.remove(i);
					strArr2.remove(j);
					i--;
					break;
				}
			}
		}

		tmp = (double)(andArr.size()*65536)/(strArr1.size()+strArr2.size()+andArr.size());
		answer = (int)tmp;

		return answer;
	}
}
