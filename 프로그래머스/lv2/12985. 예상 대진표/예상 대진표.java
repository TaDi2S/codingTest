class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;
        
        int cnt = 0;
        
        while(true){
            cnt++;
            a = (a+1)/2;
            b = (b+1)/2;
            if(a == b) break;            
        }
        
        answer = cnt;

        return answer;
    }
}