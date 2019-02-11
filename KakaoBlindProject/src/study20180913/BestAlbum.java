package study20180913;

import java.util.*;

public class BestAlbum {
	public static void main(String[] args) {
		BASolution ba = new BASolution();
		String[] genres = {"classic", "pop", "classic", "classic", "pop", "kpop"};
		int[] plays = {500, 600, 150, 800, 2500,5000};
		System.out.println(ba.solution(genres, plays));
	}
}

class BASolution {
	public int[] solution(String[] genres, int[] plays) {
		int[] answer = {};
		HashSet<String> genreCount = new HashSet<>();
		for(int i=0; i<genres.length; i++)
			genreCount.add(genres[i]);
		HashMap<String, Integer> genreTotalCount = new HashMap<>();
		Iterator<String> itString = genreCount.iterator();
		while(itString.hasNext())
			genreTotalCount.put(itString.next(), 0);

		for(int i=0; i<genres.length; i++){
			genreTotalCount.put(genres[i], genreTotalCount.get(genres[i])+plays[i]);
		}
		System.out.println(genreTotalCount);

		ArrayList<String> sortedGenre = (ArrayList<String>) sortByValue(genreTotalCount);
		HashMap<String,Integer>[] map = new HashMap[sortedGenre.size()];
		System.out.println(sortedGenre);
		
		for(int i=0; i<map.length; i++) {
			for(int j=0; j<genres[j].length(); j++) {
				if(sortedGenre.get(i).equals(genres[j]))
					map[i].put(genres[j], plays[j]);
			}
			System.out.println(map[i]);
		}
		return answer;
	}
	
	/***
	 * 내림차순 정렬(value에 의한) --> 주석처리 없애면 오름차순
	 * @param map
	 * @return
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List sortByValue(final Map map) {
		List list = new ArrayList();
		list.addAll(map.keySet());
		Collections.sort(list,new Comparator() {
			public int compare(Object o1,Object o2) {
				Object v1 = map.get(o1);
				Object v2 = map.get(o2);
				return ((Comparable) v2).compareTo(v1);
			}
		});
//		Collections.reverse(list); // 주석시 오름차순
		return list;
	}
}