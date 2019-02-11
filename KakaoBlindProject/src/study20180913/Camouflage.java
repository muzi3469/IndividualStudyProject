package study20180913;

import java.util.*;

public class Camouflage {
	public static void main(String[] args) {
		CSolution cs = new CSolution();
		String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
		System.out.println(cs.solution(clothes));
	}
}

class CSolution {
    public int solution(String[][] clothes) {
        int answer = 0;
        HashSet<String> arrTypeCnt = new HashSet<>();
        for(int i=0; i<clothes.length; i++)
        	arrTypeCnt.add(clothes[i][1]);
        
        System.out.println(arrTypeCnt);
        HashMap<Integer, String>[] arrClothes = new HashMap[arrTypeCnt.size()];
        
        return answer;
    }
    
}