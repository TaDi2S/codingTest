import java.util.Arrays;
class Solution {
    public int solution(int[] citations) {
       int answer = 0;
       
       Arrays.sort(citations);
       
       int size = citations.length;
       int cnt = 0;
       for(int i = size-1; i >= 0; i--) {
    	   int num = citations[i];
    	   if(num <= cnt) break;
    	   
    	   
    	   cnt++;
    	   
       }
       
       answer = cnt;
       
       return answer;
    }
}