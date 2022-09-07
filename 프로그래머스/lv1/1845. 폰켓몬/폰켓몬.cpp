#include <vector>
#include <algorithm>
using namespace std;

int solution(vector<int> nums)
{
    int answer = 0;
    int device_num = nums.size()/2;
    
    sort(nums.begin(), nums.end());
    
    nums.erase(unique(nums.begin(), nums.end()), nums.end());
    
    if(device_num <= nums.size()) return device_num;
    else if(device_num > nums.size()) return nums.size();
    
    
    return answer;
}