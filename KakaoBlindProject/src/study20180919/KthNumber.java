package study20180919;

import java.util.*;

public class KthNumber {
	public static void main(String[] args) {
		KNumberSolution s = new KNumberSolution();
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3},{4,4,1},{1,7,3},};
		System.out.println(Arrays.toString(s.solution(array, commands)));
	}
}
class KNumberSolution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int findIndex;
        int len = array.length;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<commands.length; i++) {
        	list.clear();
        	for(int j = commands[i][0]-1; j<commands[i][1];j++) {
        		list.add(array[j]);
        	}
        	Object[] tmpSort = list.stream().sorted().toArray();
        	findIndex = commands[i][2]-1;
        	answer[i] = (int) tmpSort[findIndex];
        }
        return answer;
    }
}