package study20180928;

import java.util.*;

public class FindWeekScore {

}

class Student{
	String id;
	ArrayList<WeekScore> arr = new ArrayList<>();
	public void find(int week,int score) {
		Iterator<WeekScore> it = arr.iterator();
		while(it.hasNext()) {
			WeekScore ws = it.next();
			if(ws.getWeek() == week)
				ws.setScore(score);
		}
	}
}

class WeekScore{
	int week;
	int score;
	public int getWeek() {
		return week;
	}
	public void setWeek(int week) {
		this.week = week;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
}