class Solution {
    public int solution(int[] priorities, int location) {
       int size = priorities.length;
       
       int cnt = 0;
       int printCnt = 0;
       
       while(true) {
    	   int now = cnt%size;
    	   int val = priorities[now];
    	   for(int i = 1; i <size; i++ ) {
    		   int val2 = priorities[(now + i)%size];
    		   if(val < val2) {
    			   break;
    		   }
    		   if(i == size-1) {
    			   priorities[now] = 0;
    			   val = 0;
    			   printCnt++;
    		   }
    	   }
    	   
    	   if(now == location && val == 0) {
    		   break;
    	   }
    	   cnt++;
       }
       
       return printCnt;
    }
}