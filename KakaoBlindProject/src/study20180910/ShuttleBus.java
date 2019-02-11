package study20180910;

public class ShuttleBus {
	public static void main(String[] args) {
		String[] timetable = {"08:00", "08:01", "08:02", "08:03"};
		ShuttleBusSolution sbs = new ShuttleBusSolution();
		System.out.println(sbs.solution(1, 1, 5, timetable));
	}
}

class ShuttleBusSolution {
	public String solution(int n, int t, int m, String[] timetable) {
		/**
		 * n : 셔틀 운행 횟수
		 * t : 셔틀 간격(분)
		 * m : 최대 승객 수
		 * timetable : 크루 도착 시간 테이블
		 */
		String answer = "";
		String[][] splitStr = new String[timetable.length][];
		int [] totalMinute = new int[timetable.length];
		int[] startBus = new int[n];		// m명이 넘어가면 다음으로 넘김.
		int mCount = 0;			//한번에 m명까지만 태울 수 있다. n회가 여유가 있다면 0으로 초기화 후 다시 사용.
		startBus[0] = 9*60;		//9시부터 셔틀 운행이기에 처음은 무조건 9시.
		
		for(int i=0;i<timetable.length; i++)
			splitStr[i] = timetable[i].split(":");
		
		for(int i=0; i<splitStr.length;i++)
			totalMinute[i] = Integer.parseInt(splitStr[i][0])*60 + Integer.parseInt(splitStr[i][1]);
		
		for(int i=0; i<n;i++)
			;
		return answer;
	}
}
