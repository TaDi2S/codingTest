import java.util.HashMap;
class Solution {
    public int solution(String[][] clothes) {
       int size = clothes.length;

       HashMap<String, Integer> map = new HashMap<>();
       
       for(int i = 0; i < size; i++) {
    	   if(map.containsKey(clothes[i][1])) {
    		   int cnt = map.get(clothes[i][1]);
    		   cnt++;
    		   map.put(clothes[i][1], cnt);    		   
    	   }else {
    		   map.put(clothes[i][1], 1);    		   
    	   }    	   
       }   
       
       int cnt = 1;
       
       for(Integer num : map.values()) {
    	   cnt *= (1+num);
    	   
       }          
       
       return cnt-1;
    }
}