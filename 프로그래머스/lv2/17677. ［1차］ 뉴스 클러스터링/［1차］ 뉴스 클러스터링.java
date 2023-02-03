import java.util.HashMap;
class Solution {
    public int solution(String str1, String str2) {
       int answer = 0;
       
       HashMap<Integer, int[][]> strArray = new HashMap<>();
       
       for(int i = 65; i <=90; i++) {
    	   int[][] tmp = new int[2][26];
    	   strArray.put(i, tmp);
       }
       
       int str1Length = str1.length();
       int str2Length = str2.length();
       
       for(int i = 0; i < str1Length-1; i++) {
    	   int tmp1 = ((str1.charAt(i) > 90) ? str1.charAt(i) - 32 : str1.charAt(i));
    	   int tmp2 = ((str1.charAt(i+1) > 90) ? str1.charAt(i+1) - 32 : str1.charAt(i+1));
    	   if(tmp1 > 90 || tmp1 < 65 || tmp2 > 90 || tmp2 < 65) {
    		   continue;
    	   }
    	   
    	   int[][] intArrTmp = strArray.get(tmp1);
    	   
    	   intArrTmp[0][tmp2-65]++;
    	   
    	   strArray.put(tmp1, intArrTmp);

       }
       
       for(int i = 0; i < str2Length-1; i++) {
    	   int tmp1 = ((str2.charAt(i) > 90) ? str2.charAt(i) - 32 : str2.charAt(i));
    	   int tmp2 = ((str2.charAt(i+1) > 90) ? str2.charAt(i+1) - 32 : str2.charAt(i+1));
    	   if(tmp1 > 90 || tmp1 < 65 || tmp2 > 90 || tmp2 < 65) {
    		   continue;
    	   }
    	   
    	   int[][] intArrTmp = strArray.get(tmp1);
    	   
    	   intArrTmp[1][tmp2-65]++;
    	   
    	   strArray.put(tmp1, intArrTmp); 	   
       }
       
       double min = 0;
       double max = 0;
       
       for(int[][] intArrTmp : strArray.values()) {
    	   for(int i = 0; i < 26; i++) {
    		   if(intArrTmp[0][i] > intArrTmp[1][i]) {
    			   min += intArrTmp[1][i];
    			   max += intArrTmp[0][i];
    		   }else {
    			   max += intArrTmp[1][i];
    			   min += intArrTmp[0][i];
    		   }
    	   }
       }
       
       if(max == 0) {
           answer = 65536;
       }else{
          answer = (int)(min / max * 65536); 
       }
       
       
       return answer;
    }
}