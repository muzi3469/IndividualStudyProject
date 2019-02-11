package study20180919;

import java.util.*;
import java.util.Map.Entry;

public class MySelfStringSort {
	public static void main(String[] args) {
		MSelfStringSortSolution s = new MSelfStringSortSolution();
		String[] strings = {"abce", "abcd", "cdx"};
		System.out.println(Arrays.toString(s.solution(strings, 2)));
	}
}
class MSelfStringSortSolution {
	public String[] solution(String[] strings, int n) {
		String[] answer = new String[strings.length];
		int len=strings.length;
		HashMap<Integer, String> map = new HashMap<>();
		int indexOfMap = 0;
		for(int i=0; i<len; i++)
			map.put(i, strings[i].substring(n));
		System.out.println(map);

		List<Entry<Integer, String>> list = new LinkedList<Entry<Integer,String>>(map.entrySet());

		Collections.sort(list, new Comparator<Entry<Integer, String>>() {
			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		for (Entry<Integer, String> entry : list)
		{
			answer[indexOfMap++] = strings[entry.getKey()];
		}

		return answer;
	}
}