import java.util.ArrayList;
import java.util.LinkedList;

class Solution {
    public int solution(String s) {
       int answer = 0;
       
       char[] charsArr = new char[s.length()];
       
       int size = s.length();
       
       ArrayList<Character> openArr = new ArrayList<>();
       openArr.add('(');
       openArr.add('{');
       openArr.add('[');    
       ArrayList<Character> closeArr = new ArrayList<>();
       closeArr.add(')');
       closeArr.add('}');
       closeArr.add(']');       
       
       
       
       s.getChars(0, s.length(), charsArr, 0);
       
       for(int i = 0; i < size; i++) {
    	   boolean flag = true;
    	   LinkedList<Character> lastChar =  new LinkedList<>();
    	   lastChar.add('0');
    	   int open = 0;
    	   for(int j = 0; j < size; j++) {
    		   int n = (i+j >= size) ? i+j-size : i+j;
    		   char tmp = charsArr[n];
    		   int index = closeArr.indexOf(tmp);
    		   if(index >= 0) {
				   open--;
	    		   if(open < 0) {
	    			   flag = false;
	    			   break;
	    		   }	    		   
    			   if(openArr.get(index) != lastChar.getLast()) {
    				   flag = false;
    				   break;    				   
    			   }else {
    				   lastChar.removeLast();
    			   }
    		   }else {
    			   lastChar.add(tmp); 
    			   open++;
    		   }
    	   }    	   
    	   if(flag && open == 0) answer++;
       }       
       return answer;
    }
}