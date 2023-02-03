class Solution {
    public int solution(String[][] book_time) {
 int answer = 0;
       int[] timeArr = new int[1440];
       int xLength = book_time.length;
       
       for(int i = 0; i < xLength; i++) {
    	   String[] startTimeStr = book_time[i][0].split(":");
    	   String[] endTimeStr = book_time[i][1].split(":");
    	   
    	   int startTime = Integer.parseInt(startTimeStr[0]) * 60 + Integer.parseInt(startTimeStr[1]);
    	   int endTime = Integer.parseInt(endTimeStr[0]) * 60 + Integer.parseInt(endTimeStr[1]) + 10;
    	   
    	   try {
    		   for(int j = startTime; j < endTime; j++) {
    			   timeArr[j]++;
    			   answer = (answer < timeArr[j]) ? timeArr[j] : answer;
    		   }    		   
    	   } catch(ArrayIndexOutOfBoundsException e) {
    		   continue;
    	   }
    	   
       }
       
       
       return answer;
    }
}