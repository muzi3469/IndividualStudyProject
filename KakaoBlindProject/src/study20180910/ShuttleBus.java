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
		 * n : ��Ʋ ���� Ƚ��
		 * t : ��Ʋ ����(��)
		 * m : �ִ� �°� ��
		 * timetable : ũ�� ���� �ð� ���̺�
		 */
		String answer = "";
		String[][] splitStr = new String[timetable.length][];
		int [] totalMinute = new int[timetable.length];
		int[] startBus = new int[n];		// m���� �Ѿ�� �������� �ѱ�.
		int mCount = 0;			//�ѹ��� m������� �¿� �� �ִ�. nȸ�� ������ �ִٸ� 0���� �ʱ�ȭ �� �ٽ� ���.
		startBus[0] = 9*60;		//9�ú��� ��Ʋ �����̱⿡ ó���� ������ 9��.
		
		for(int i=0;i<timetable.length; i++)
			splitStr[i] = timetable[i].split(":");
		
		for(int i=0; i<splitStr.length;i++)
			totalMinute[i] = Integer.parseInt(splitStr[i][0])*60 + Integer.parseInt(splitStr[i][1]);
		
		for(int i=0; i<n;i++)
			;
		return answer;
	}
}
