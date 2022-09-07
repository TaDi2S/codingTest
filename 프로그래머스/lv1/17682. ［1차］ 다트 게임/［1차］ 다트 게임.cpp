#include <string>

using namespace std;

int solution(string dartResult) {
    int answer = 0;
    int int_arr[3] = { 0,};
    int cnt = 0;
    int cnt2 = 0;
    bool check = true;
    for (int i = 0; i < dartResult.size(); i++) {
        if (dartResult[i] == '*') {
            if (cnt == 0) {
                int_arr[cnt] = int_arr[cnt] * 2;
                cnt++;
            }
            else {
                int_arr[cnt] = int_arr[cnt] * 2;
                int_arr[cnt  - 1] = int_arr[cnt - 1] * 2;
                cnt++;
            }
        }else if (dartResult[i] == '#') {
            int_arr[cnt] = int_arr[cnt] * (-1);
            cnt++;
        }
        if (dartResult[i] >= '0' && dartResult[i] <= '9') {
            int_arr[cnt] = dartResult[i] - '0';
             if (dartResult[i + 1] == '0') {
                int_arr[cnt] = int_arr[cnt] + 9;
                i = i + 1;
            }
        }else if (dartResult[i] == 'S') {
            if (i < dartResult.size() - 1) {
                if (dartResult[i + 1] == '*' || dartResult[i + 1] == '#') {
                }
                else {
                    cnt++;
                }
            }
        }else if (dartResult[i] == 'D') {
            int_arr[cnt] = int_arr[cnt] * int_arr[cnt];
            if (i < dartResult.size() - 1) {
                if (dartResult[i + 1] == '*' || dartResult[i + 1] == '#') {
                }
                else {
                    cnt++;
                }
            }
        }else if (dartResult[i] == 'T') {
            int_arr[cnt] = int_arr[cnt] * int_arr[cnt] * int_arr[cnt];
            if (i < dartResult.size() - 1) {
                if (dartResult[i + 1] == '*' || dartResult[i + 1] == '#') {
                }
                else {
                    cnt++;
                }
            }
        }

    }
    printf("int_arr : {%d, %d, %d}\n", int_arr[0], int_arr[1], int_arr[2]);
    answer = int_arr[0] + int_arr[1] + int_arr[2];
    return answer;
}