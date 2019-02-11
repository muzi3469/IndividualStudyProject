package study20180919;

import java.util.*;

public class GiveUpMath {
	public static void main(String[] args) {
		GUpMSolution s = new GUpMSolution();
		int[] answers = {1,3,2,4,2};
		System.out.println(Arrays.toString(s.solution(answers)));
	}
}

class GUpMSolution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] firstGiveUp = {1,2,3,4,5};
        int[] secondGiveUp= {2,1,2,3,2,4,2,5};
        int[] thirdGiveUp = {3,3,1,1,2,2,4,4,5,5};
        
        ArrayList<Integer> score = new ArrayList<>();
        score.add(0);	//수포자 1
        score.add(0);	//수포자 2
        score.add(0);	//수포자 3
        int count = 0;
        for(int i=0,j=0; i<answers.length; i++,j++) {
        	if(answers[i] == firstGiveUp[j%firstGiveUp.length])
        		count++;
        }
        score.set(0,count);
        count=0;
        for(int i=0,j=0; i<answers.length; i++,j++) {
        	if(answers[i] == secondGiveUp[j%secondGiveUp.length])
        		count++;
        }
        score.set(1,count);
        count=0;
        for(int i=0,j=0; i<answers.length; i++,j++) {
        	if(answers[i] == thirdGiveUp[j%thirdGiveUp.length])
        		count++;
        }
        score.set(2,count);
        int max = score.get(0);
        for(int i=1; i<3; i++)
        	if(max<score.get(i))
        		max = score.get(i);
        
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0; i<3; i++)
        	if(max == score.get(i))
        		a.add(i);
        
        answer = new int[a.size()];
        for(int i=0;i<a.size();i++)
        	answer[i] = a.get(i)+1;
        
        return answer;
    }
}
