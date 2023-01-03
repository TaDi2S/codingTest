import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.LinkedList;


class Solution {
    public int solution(int[] people, int limit) {
       int answer = 0;
       
       
       Arrays.sort(people);
       
       int size = people.length;
       answer = people.length;
       
       for(int i = 0; i < size; i++) {
    	   int anchovy = people[i];
    	   int startAnswer = answer;
    	   for(int j = size-1; j >i; j--) {
    		   int pig = people[j];
    		   if(pig + anchovy <= limit) {
    			   answer--;
    			   size = j;
    			   break;
    		   }
    	   }
    	   if(startAnswer == answer) break;
       }
       
       return answer;
   }
    
}