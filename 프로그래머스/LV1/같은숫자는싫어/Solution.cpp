// 문제 정보
// https://programmers.co.kr/learn/courses/30/lessons/12906

#include <vector>
#include <iostream>

using namespace std;

vector<int> solution(vector<int> arr) 
{
    vector<int> answer;
    
    answer.push_back(arr[0]); 
    
    for(int i = 1 ; i < arr.size() ; i++){
        if ( answer.back() == arr[i] ) continue;  // vector 맨 끝에 확인하는 거는 back() 함수. 
        else{
            answer.push_back(arr[i]);  
        }
        //다시 생각해보니 그냥 if문 하나로 돌렸어도 되었을 거 같네. 
    }

    return answer;
}
