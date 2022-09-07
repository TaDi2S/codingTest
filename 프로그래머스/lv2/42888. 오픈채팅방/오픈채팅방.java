import java.util.HashMap;
import java.util.Map.Entry;

class Solution {
    public String[] solution(String[] record) {
        String[] answer = {};
        StringBuilder sb = new StringBuilder();
        
        HashMap<String, String> id_map = new HashMap<>();
        
        int size = record.length;
        String[] answer2 = new String[size];
        int cnt = 0;
        for(int i = 0; i < size; i++) {
        	String[] tmp_str = record[i].split(" ");
        	
        	if(tmp_str[0].charAt(0) == 0x43) {// C   		
        		id_map.put(tmp_str[1], tmp_str[2]);
        	} else if(tmp_str[0].charAt(0) == 0x45) {// E	
        		id_map.put(tmp_str[1], tmp_str[2]);
        		answer2[cnt] = "E," + tmp_str[1];
        		cnt++;
        		
        	} else if(tmp_str[0].charAt(0) == 0x4c) {// L
        		answer2[cnt] = "L," + tmp_str[1];;
        		cnt++;
        	}
        }
        
        answer = new String[cnt];
        
        for(int i = 0; i < cnt; i++) {
        	if(answer2[i] == null) {
        		break;
        	}
        	String[] tmp = answer2[i].split(",");
        	
        	if(tmp[0].charAt(0) == 0x45) {
        		answer[i] = id_map.get(tmp[1]) + "님이 들어왔습니다.";
        	}else {
        		answer[i] = id_map.get(tmp[1]) + "님이 나갔습니다.";
        	}
        	
        }
        return answer;
    }
}