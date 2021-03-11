//https://programmers.co.kr/learn/courses/30/lessons/68935
#include <string>
#include <vector>
#include <algorithm>
#include <iostream>

using namespace std;

int solution(int n) {
    int answer = 0;
    
    vector<int> arr ; 
    
   
    //10진법을 3진법으로 변환
    while( n / 3 != 0 ){
        arr.push_back(n%3); 
        
        n /= 3;    
    }
    arr.push_back(n); 
    
    //cout << arr.size() <<endl; 
    int tri = 1;
    for(int i = arr.size()-1  ; i >=0  ; i-- ){
        // cout << arr[i] <<endl; 
        // 이미 넣을 때 뒤집혀져서 들어가있다. 
        
        //3진법을 10진법으로 바꾸려고 하면... 
        //뒤에서부터 더해주고 *3을 먹여가면서 하는게 좋긴한데. 
        
        //거꾸로 순회해보자. 
        answer += arr[i] *tri; 
        tri*=3;
    }
    
    
    return answer;
}
