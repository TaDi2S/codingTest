#include <vector>
#include <iostream>
#include <math.h>
using namespace std;

bool sosu_check(int a){
    int num = sqrt(a);

    for (int i = 2; i <= num*2; i++) {
        if (a % i == 0) { 
            return false; 
        }
    }
    return true;
}

int solution(vector<int> nums) {
    int answer = 0;
    vector<int> tmp;
    int int_tmp = 0;
    for (int i = 0; i < nums.size()-2; i++) {
        for (int j = i + 1; j < nums.size() - 1; j++) {
            for (int k = j + 1; k < nums.size(); k++) {
                int_tmp =  nums[i] + nums[j] + nums[k];
                tmp.push_back(int_tmp);
            }
        }
    }
    for (int i = 0; i < tmp.size(); i++) {
        if (sosu_check(tmp[i])) {
            answer++;
        }
        
    }

    return answer;
}