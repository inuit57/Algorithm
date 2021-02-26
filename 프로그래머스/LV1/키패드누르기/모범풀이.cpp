// 출처 : https://ksdyoung.tistory.com/117

#include <string>
#include <vector>
 
using namespace std;
 
int abs(int a, int b)
{
    return a > b ? a - b : b - a;
}
string getstr(int lx, int ly, int rx, int ry, int num, string hand)
{
    int l = abs(lx, 2) + abs(ly, num/3);
    int r = abs(rx, 2) + abs(ry, num/3);
    if (l == r)
    {
        if (hand[0] == 'l') return "L";
        else return "R";
    }
    else if( l < r)
        return "L";
    else
        return "R";
}
string solution(vector<int> numbers, string hand) {
    string answer = "";
    int left_x = 1, left_y = 3, right_x = 3, right_y = 3;
    for(auto num : numbers)
    {
        switch(num){
            case 1:case 4:case 7:
                answer += "L";
                left_x = 1;
                left_y = num/3;
                break;
            case 3:case 6:case 9:
                answer += "R";
                right_x = 3;
                right_y = num/3 - 1;
                break;
            default :
                if(num == 0) num = 10;
                string tmp = getstr(left_x, left_y, right_x, right_y, num, hand); 
                answer += tmp;
                if (tmp == "L")
                {
                    left_x = 2;
                    left_y = num/3;
                }
                else
                {
                    right_x = 2;
                    right_y = num/3;
                }
                
                break;
        }
    }
    return answer;
}
