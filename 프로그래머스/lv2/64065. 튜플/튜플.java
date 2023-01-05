import java.util.HashMap;
import java.util.Arrays;
import java.util.stream.Stream;
class Solution {
    public int[] solution(String s) {
       int[] answer = {};       
       
       String[] strArr = s.replaceAll("\\},\\{", "a").replaceAll("\\}|\\{", "").split("a");
       
       HashMap<Integer, Integer> lengthIndex = new HashMap<>();      
       int size = strArr.length;
       
       for(int i = 0; i < size; i++) {
    	   String[] strTmp = strArr[i].split(",");
    	   int[] intTmp = Stream.of(strTmp).mapToInt(Integer::parseInt).toArray();;
    	   int sum = Arrays.stream(intTmp).sum();
    	   lengthIndex.put(intTmp.length, sum);
       }
       
       int last = 0;      
       
       answer = new int[size];
       
       for(int i = 1; i <= size; i++) {
    	   int intTmp = lengthIndex.get(i);
    	   answer[i-1] = intTmp - last;
    	   
    	   last = intTmp;
    	   
       }
       
       return answer;
    }
}