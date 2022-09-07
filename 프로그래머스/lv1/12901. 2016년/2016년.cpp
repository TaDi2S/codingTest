#include <string>
#include <vector>

using namespace std;
int mon[12] = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
int sum_day(int a) {
    int day_mon = 0;
    for (int i = 0; i < a; i++) {
        day_mon += mon[i];
    }
    //printf("day_mon : %d\n", day_mon);
    return day_mon;
}
string solution(int a, int b) {
    string answer = "";
    string day[7] = {"FRI","SAT","SUN","MON","TUE","WED","THU", };

    int d_day = sum_day(a-1) + b-1;

    //printf("d_day : %d\n", d_day);

    answer = day[d_day % 7];

    return answer;
}