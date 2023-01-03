import java.util.ArrayList;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        
        ArrayList<Integer> newArr = new ArrayList<>();
        
        int max = arr[0];
        
        newArr.add(arr[0]);
        
        for(int a : arr){
            if(max<a){
                max = a;
                newArr.add(a);
                continue;
            }
            
            if(max % a == 0){
                continue;
            }else{
                newArr.add(a);
            }
        }
        
        int max2 = max;
        
        while(true){
            boolean flag = true;
            for(int a : newArr){
                if(max2 % a != 0) flag = false;
            }
            if(flag) break;
            max2 += max;
        }
        answer = max2;
        return answer;
    }
}