import java.util.ArrayList;

class Solution {
    public int solution(int k, int[][] dungeons) {
        int answer = 0;
                
       int length = dungeons.length;
       
       for(int i = 0; i < length; i++) {
    	   ArrayList<Integer> aa = new ArrayList<>();    	  
    	   int cnt = RePeeLoDo(dungeons, aa, length, i, i, 0, k);
    	  answer = (cnt > answer) ? cnt : answer;
       }
       
        return answer;
    }
    
        public int RePeeLoDo(int[][] dungeons, ArrayList<Integer> visitNum, int length, int startNum, int nowNum, int cnt, int k) {
    	if(dungeons[nowNum][0] > k) {
    		return cnt;
    	}
    	
    	visitNum.add(nowNum);
    	k -= dungeons[nowNum][1];
    	cnt++;
    	int cnt2 = 0;
    	for(int i = 0; i < length; i++) {
    		if(visitNum.contains(i)) continue;    		
    		int cnt3 =RePeeLoDo(dungeons, visitNum, length, startNum, i, cnt, k);
    		cnt2 = (cnt2 < cnt3) ? cnt3 : cnt2;
    	}    	    	
    	
    	visitNum.remove(Integer.valueOf(nowNum));
    	
    	cnt = (cnt < cnt2) ? cnt2 : cnt;
    	return cnt;
    }
}