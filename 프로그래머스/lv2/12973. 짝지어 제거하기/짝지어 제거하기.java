import java.util.Stack;

class Solution
{
    public int solution(String s)
    {
        char[] chars = s.toCharArray();
        
        Stack<Character> stack = new Stack<>();
                
        int size = chars.length;
        
        for(int i = 0; i < size; i++) {
        	if(stack.size() <= 0) {
        		stack.push(Character.valueOf(chars[i]));
        	}else {        		
        		if(stack.peek() == Character.valueOf(chars[i])) {
        			stack.pop();
        		}else {
        			stack.push(Character.valueOf(chars[i]));
        		}
        	}
        }
        return stack.size() == 0 ? 1 : 0;
    }
}