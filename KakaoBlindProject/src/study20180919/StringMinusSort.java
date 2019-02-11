package study20180919;

import java.util.*;

public class StringMinusSort {
	public static void main(String[] args) {
		SMinusSolution s = new SMinusSolution();
		String str = "Zbcdefg";
		System.out.println(s.solution(str));
	}
}
class SMinusSolution {
	  public String solution(String s) {
	      String answer = "";
	      char[] ch = new char[s.length()];
	      ch = s.toCharArray();
	      
	      List<String> list = new LinkedList<>();
	      for(int i=0; i<s.length(); i++)
	    	  list.add(ch[i]+"");
	      
	      Collections.sort(list, new Comparator<String>() {
	    	  @Override
	    	public int compare(String o1, String o2) {
	    		return o2.compareTo(o1);
	    	}
		});
	      System.out.println(list);
	      Iterator<String> it = list.iterator();
	      while(it.hasNext())
	    	  answer+=it.next();
	      
	      return answer;
	  }
	}