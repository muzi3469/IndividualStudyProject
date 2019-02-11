package study20180910;

import java.util.ArrayList;

public class Cache {
	public static void main(String[] args) {
		CSolution cs = new CSolution();
		String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
		int cacheSize = 3;
		System.out.println(cs.solution(cacheSize, cities));
	}
}

class CSolution {
	public int solution(int cacheSize, String[] cities) {
		int answer = 0;
		/**
		 * 캐시는 LRU(Least Recently Used) 사용
		 * cache hit일 경우 실행시간 1
		 * cache miss일 경우 실행시간 5
		 */
		//소문자로 초기화
		for(int i=0; i<cities.length; i++) {
			cities[i] = cities[i].toLowerCase();
		}
		ArrayList<String> strArr = new ArrayList<>();
		int n = cities.length;
		if(cacheSize==0)
			return 5*n;
		
		for(int i=0; i<n; i++) {
			if(strArr.size()<cacheSize) {
				if(strArr.contains(cities[i])) {
					answer++;
					strArr.remove(cities[i]);
					strArr.add(cities[i]);
				} else {
					answer += 5;
					strArr.add(cities[i]);
				}
			} else {
				if(strArr.contains(cities[i])) {
					answer++;
					strArr.remove(cities[i]);
					strArr.add(cities[i]);
				} else {
					answer += 5;
					strArr.remove(0);
					strArr.add(cities[i]);
				}
			}
		}
		
		
		return answer;
	}
}
