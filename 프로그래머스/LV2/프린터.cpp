// https://programmers.co.kr/learn/courses/30/lessons/42587#

#include <string>
#include <vector>
#include<iostream>
#include<algorithm> 

using namespace std;

int solution(vector<int> priorities, int location) {
    int answer = 0;
    int cnt = 1; 
    int max = *max_element(priorities.begin(), priorities.end()); 
    int backup = 0 ; 
    
    
    // if(priorities[location] == max){
    //     return cnt ; 
    // }    -> 숫자가 모두 동일하게 입력된 경우에 제대로된 결과를 안 내놓는다. 
    
    while(!priorities.empty()){
        max = *max_element(priorities.begin(), priorities.end()); 
         
        if(priorities[0] != max){
            priorities.push_back(priorities[0]); 
            priorities.erase(priorities.begin()); //처음꺼를 빼고 지운다. 
     
            if(location != 0) {
                location -- ;
               
            } //앞으로 당긴다.
            else{ 
                location += (priorities.size() -1 );
               
            }
            cout << priorities[0] <<"," << location << endl; 
            
        }else{  // 0이 max라면
           
            if (location == 0) {
                return cnt ; 
            }
            else{
               priorities.erase(priorities.begin()); 
               cnt ++; 
               location --; 
            }
            cout << priorities[0] <<"," << location << endl;
        }
    }
    //return answer;
    return cnt; 
}
