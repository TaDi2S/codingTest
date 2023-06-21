import java.util.Arrays;

class Solution {
    public int solution(int[][] targets) {
       int answer = 0;
       
       Arrays.sort(targets, (a, b) -> Integer.compare(a[1], b[1]));
       
       int interceptors = 0;
       int maxEnd = 0;
       
       for(int[] target : targets) {
    	   int start = target[0];
    	   int end = target[1];
    	   
    	   if(start >= maxEnd) {
    		   interceptors++;
    		   maxEnd = end;
    	   }
    	   
       }
       
       answer = interceptors;
       return answer;
    }
}