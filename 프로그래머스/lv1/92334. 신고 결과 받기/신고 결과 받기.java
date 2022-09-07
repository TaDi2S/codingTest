import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = {};
        answer = new int[id_list.length];
        
        HashMap<String, ArrayList<String>> node_hash = new HashMap<>();
        ArrayList<String> id_list_arr = new ArrayList<>();
        
        for(int i = 0; i < id_list.length; i++) {
        	answer[i] = 0;
        	id_list_arr.add(id_list[i]);
        }
        
        for(String report_msg : report) {
        	String[] report_id = report_msg.split(" ");
        	
        	String from_id 	= report_id[0];
        	String to_id 	= report_id[1];
        	
        	
        	if(node_hash.containsKey(to_id)) {
        		ArrayList<String> tmp = node_hash.get(to_id);
        		
        		if(tmp.contains(from_id)) {
        			continue;
        		}else {
        			tmp.add(from_id);
                    node_hash.replace(to_id, tmp);
        		}
        		
        	}else {
        		ArrayList<String> tmp = new ArrayList<>();        		
        		tmp.add(from_id);    
                node_hash.put(to_id, tmp);
        	}
        }
        
        for(String key : node_hash.keySet()) {
        	ArrayList<String> tmp = node_hash.get(key);
        	
        	if(tmp.size() >= k) {
        		for(int i = 0; i < tmp.size(); i++) {
        			String id = tmp.get(i);
        			int index = id_list_arr.indexOf(id);        		
        			answer[index] = answer[index] + 1;
        		}
        	}        	
        }
        return answer;
    }
}