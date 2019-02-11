package study20180913;

import java.util.*;

public class PhoneBook {
	public static void main(String[] args) {
		PBSolution pb = new PBSolution();
		String[] phone = {"119", "97674223", "1195524421"};
//		System.out.println(pb.solution(phone));
		HashMap<Integer, String> arr = new HashMap<>();
		int cnt = 0;
		for(int i=0; i<phone.length; i++) {
			arr.put(cnt++, phone[i].replace(" ", ""));
		}
		System.out.println(arr.get(2).substring(0, phone[0].length()).contains(phone[0]));
	}
}

class PBSolution {
	public boolean solution(String[] phone_book) {
		boolean answer = true;
		HashMap<Integer, String> arr = new HashMap<>();
		int cnt = 0;
		for(int i=0; i<phone_book.length; i++) {
			arr.put(cnt++, phone_book[i].replace(" ", ""));
		}
		for(int i=0; i<cnt; i++) {
			for(int j=0; j<cnt;j++) {
				if(i!=j) {
					if(phone_book[i].length()>=arr.get(j).length()) {
						if(arr.get(j).contains(phone_book[i].substring(0, arr.get(j).length())))
							answer = false;
					} else {
						if(phone_book[i].contains(arr.get(j).substring(0, phone_book[i].length())))
							answer = false;
					}
				}
			}
		}
		return answer;
	}
}
