#include <string>
#include <vector>
#include <iostream>
#include<algorithm>

using namespace std;

//이전 계획
    //정렬함수를 만들어서 처리해야 한다. 
    // 맨앞의 숫자부터 비교해서 큰 순서대로 정렬해야 한다. 
    // 1) 첫자리를 비교해서 큰 놈이 앞으로 온다. 
    // 2) 첫자리가 같은 경우 다음 자리를 비교해서 큰 놈이 앞으로 온다. 
    // 3) 차이가 날 때까지 반복한다. 
    // 4) 만약 다음 자리가 없다면 ? 없는 놈을 앞으로 놓는다. 
    
    // 9999 vs 90 을 생각해본다. 9999가 먼저 오는게 맞다. 
    // 9 vs 9999 를 생각해본다. 상관없다. 
    // 5 vs 9999 를 생각해본다. 9999가 앞으로 와야 한다. 
    // 999 vs 9998 을 생각해본다. 999가 앞으로 와야 한다. 


bool compare(string a, string b){
    //int str_len = a.size() > b.size() ? b.size() : a.size(); 
    int str_len = a.size() > b.size() ? a.size() : b.size();  //더 큰 놈 반환    
        
    int A , B ; 
   
    int max = -1; 
    for(int i = 0 ; i < str_len ; i++){
        if ( i >= a.size() ){
            A = a[a.size() -1] ; 
        }else{
            A = a[i] ;  
        }
        if ( i >= b.size() ){
            B = b[b.size()-1];
        }else{
             B= b[i] ; 
        }
        if ( A != B){
               return A > B ;    
             
        }
    }
        
    return a.size() < b.size() ; //끝까지 했는데 같으면 짧은 놈 반환 ( 1000 vs 100 )
}


string solution(vector<int> numbers) {
    string answer = "";
    
    vector<string> arr ; 
    int flag = 0; 

    for(int i = 0 ; i< numbers.size() ; i++){
        string tmp = to_string(numbers[i]); 
        arr.push_back(tmp); 
        if (numbers[i] != 0) flag = 1; 
    }
    

    if(flag == 0) return "0"; 
   
    sort(arr.begin(), arr.end() , compare);  
    
    for(int i = 0 ; i < arr.size() ; i++){
        answer += arr[i]; 
    }
    
    //cout << stol(answer) << endl; 
    
    //return to_string(stol(answer));
    return answer; 
    
}

//47.5점짜리 코드
//문자열 비교의 특징을 좀더 생각했다면 쉽게 풀 수 있었을지도 모르겠네. 
//
