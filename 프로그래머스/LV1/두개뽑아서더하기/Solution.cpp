//문제 정보
// https://programmers.co.kr/learn/courses/30/lessons/68644?language=cpp

// 내부에서 중복을 알아서 걸러주는 Set이라는 자료구조를 사용했다면 
// 좀더 쉽게 풀었을 것이라 생각된다. 공부하자. 

#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> numbers) {
    vector<int> answer;
    
    int arr[201] ={0}; 
    
    for(int i= 0 ; i< numbers.size(); i++){
        for(int j= i+1 ; j< numbers.size(); j++){
            arr[numbers[i]+numbers[j]] = 1; 
        }
    }
    
    for(int i=0 ; i< 201; i++){
        if(arr[i] !=0){
            answer.push_back(i); 
        }
    }
    return answer;
}
