import java.util.LinkedList;
class Solution {
    public int solution(int cacheSize, String[] cities) {
       int answer = 0;
       
       if(cacheSize == 0) return cities.length * 5;
       
       LinkedList<String> casheArr = new LinkedList<String>();
       
       for(String city : cities) {
    	   city = city.toLowerCase();
    	   int result = casheArr.indexOf(city);
    	   if(result < 0) {
    		   answer += 5;
    		   if(casheArr.size() == cacheSize) {
    			   casheArr.removeFirst();
    		   }
    		   casheArr.add(city);
    	   }else {
    		   answer ++;
    		   casheArr.remove(result);
    		   casheArr.add(city);
    	   }
       }
       
       return answer;
    }
}