package study20181001;

import java.util.*;

public class PhonebookList {
	public static void main(String[] args) {
		PListSolution ps = new PListSolution();
		String[] phone_book = {
			"119", "97674223", "1195524421", 
		};
		System.out.println(ps.solution(phone_book));
	}
}

class PListSolution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        List<String> bookList = new ArrayList<>();
        for(int i=0; i<phone_book.length; i++)
        	bookList.add(phone_book[i]);
        
        Collections.sort(bookList, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.length() - o2.length();
			}
		});
        
        for(int i=0; i<bookList.size(); i++) {
        	for(int j=i+1; j<bookList.size(); j++) {
        		if(bookList.get(i).equals(bookList.get(j).substring(0, bookList.get(i).length()))) {
        			System.out.println(bookList.get(j).substring(0, bookList.get(i).length()));
        			answer = false;
        			break;
        		}
        	}
        	if(!answer)
        		break;
        }
        return answer;
    }
}