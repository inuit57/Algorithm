#include <string>
#include <vector>

using namespace std;

string solution(vector<string> seoul) {
    string answer = "";
    
    for(int i = 0 ; i< seoul.size() ; i++){
        if (seoul[i] == "Kim") {
            //printf("1"); 
            answer = "김서방은 "+to_string(i)+"에 있다";
           //int 형을 string 으로 바꾸는 연산을 알아두자. 
            break; 
        }
    }
    return answer;
}
