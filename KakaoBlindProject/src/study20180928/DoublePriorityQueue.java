package study20180928;

import java.util.*;

public class DoublePriorityQueue {
	public static void main(String[] args) {
		DPriorityQueueSolution ds = new DPriorityQueueSolution();
		String[] operations = {"I 7","I 5","I -5","D 1"};
		System.out.println(Arrays.toString(ds.solution(operations)));
	}
}
class DPriorityQueueSolution {
    public int[] solution(String[] operations) {
        int[] answer = {};
        PriorityQueue<Integer> que = new PriorityQueue<Integer>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		});
        
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i=0; i<operations.length; i++) {
        	String[] tmp = operations[i].split(" ");
        	if(tmp[0].equals("I")) {
        		que.add(Integer.parseInt(tmp[1]));
        		queue.add(Integer.parseInt(tmp[1]));
        	} else {
        		if(que.size() == 0)
        			continue;
        		else {
        			int num = Integer.parseInt(tmp[1]);
        			if(num == -1) {
        				System.out.println(que.poll());
        				System.out.println(queue.poll());
        			} else if(num == 1) {
        			}
        		}
        	}
        }
        
        System.out.println(que);
        
        return answer;
    }
}