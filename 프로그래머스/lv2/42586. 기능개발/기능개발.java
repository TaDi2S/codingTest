import java.util.ArrayList;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
       int[] answer = {};
       ArrayList<Integer> arr = new ArrayList<>();
       int size = progresses.length;
       int last = 0;
       while(true) {
    	   int cnt = 0;
    	   for(int i = last; i < size; i++) {
    		   progresses[i] += speeds[i];
    		   if(i <= last && progresses[i] >= 100) {
    			   last++;
    			   cnt++;
    		   }
    	   }
    	   if(cnt > 0) {
    		   arr.add(cnt);    		   
    	   }
    	   if(last >= size) break;
       }
       answer = arr.stream().mapToInt(Integer::intValue).toArray();

       return answer;
    }
}