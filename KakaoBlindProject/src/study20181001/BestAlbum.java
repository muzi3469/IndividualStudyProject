package study20181001;

import java.util.*;
import java.util.Map.Entry;

// 프로그래머스 해시-> 베스트앨범 문제

public class BestAlbum {
	public static void main(String[] args) {
		BAlbumSolution bs = new BAlbumSolution();
		String[] genres = {
			"classic", "pop", "classic", "classic", "pop"
		};
		int[] plays = {
				500,600,150,800,2500
		};
		System.out.println(Arrays.toString(bs.solution(genres, plays)));
	}
}

class BAlbumSolution {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        HashMap<String, Integer> typeOfGenre = new HashMap<>();
        ArrayList<GenrePlay> genrePlayList = new ArrayList<>();
        for(int i=0; i<genres.length; i++) {
        	if(typeOfGenre.containsKey(genres[i])) {
        		typeOfGenre.put(genres[i], typeOfGenre.get(genres[i]) + plays[i]);
        	}else
        		typeOfGenre.put(genres[i], plays[i]);
        	genrePlayList.add(new GenrePlay(i, genres[i], plays[i]));
        }
        
        int countOfType = typeOfGenre.size();
        int totalAnswerSize = 0;
        
        //장르별 총 재생횟수 내림차순으로 정렬.
        List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(typeOfGenre.entrySet());
        
        Collections.sort(list, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o2.getValue().compareTo(o1.getValue());
			}
		});
        // -------------------------
        
        List<GenrePlay>[] eachGenrePlayRank = new ArrayList[countOfType];
        for(int i=0; i<countOfType; i++) {
        	
        }
        
        System.out.println(typeOfGenre.keySet());
        System.out.println(list.get(0).getKey());
        return answer;
    }
}

class GenrePlay{
	private int indexNum;
	private String genre;
	private int play;
	public GenrePlay(int indexNum, String genre, int play) {
		this.indexNum = indexNum;
		this.genre = genre;
		this.play = play;
	}
	public int getIndexNum() {
		return indexNum;
	}
	public void setIndexNum(int indexNum) {
		this.indexNum = indexNum;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getPlay() {
		return play;
	}
	public void setPlay(int play) {
		this.play = play;
	}
	
}