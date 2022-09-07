#include <string>
#include <vector>

using namespace std;

int solution(int n, vector<int> lost, vector<int> reserve) {
        int answer = 0;
    int student[30] = {0, };
    
    for (int i = 0; i < n; i++) {
        student[i] = 1;
    }
    


    for (int i = 0; i < lost.size(); i++) {
        student[lost[i]-1] = student[lost[i]-1] - 1;
    }

    for (int i = 0; i < reserve.size(); i++) {
        student[reserve[i]-1] = student[reserve[i]-1] + 1;
    }


    for (int i = 0; i < n; i++) {
        if (student[i] == 0) {
            if (i == 0) {
                if (student[1] == 2) {
                    student[0] = 1;
                    student[1] = 1;
                }
            }
            else if (i == n - 1) {
                if (student[n-2] == 2) {
                    student[n-1] = 1;
                    student[n-2] = 1;
                }
            }
            else {
                if (student[i - 1] == 2) {
                    student[i] = 1;
                    student[i - 1] = 1;
                }
                else if (student[i + 1] == 2) {
                    student[i] = 1;
                    student[i + 1] = 1;
                }
            }
        }

        if (student[i] >= 1) {
            answer++;
        }
    }

    if (answer >= n) {
        return n;
    }
    return answer;
}