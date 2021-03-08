// https://programmers.co.kr/learn/courses/30/lessons/42840
// signal: illegal instruction (core dumped) 에러가 b, c 를 건드리려고 하면 난다. 
// 뭐가 문제인 건지 좀 살펴볼 필요가 있을 거 같다. 

#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> answers) {
    vector<int> answer;
    
    int a = 0 ; 
    int b = 0 ; 
    int c = 0 ; 
    
    // 1번 : answer[i] == (i%5)+1 이라면 정답
    // 2번 : i가 짝수일 때 (i%2) == 0 일 때 answer[i]==2라면 정답
    // 0 1 2 3 4 5 6 7 | 8  9  10  11  12  13 
    // 2 1 2 3 2 4 2 5 | 2  1   2   3   2   4  
    // 1일 때 1 이고 9일 때 1
    // 3일 때 3 이고 11일 때 3 
    // 8칸 간격으로 반복된다 ?
    // (i%8)의 나머지로 확인하면 되지 싶다. 
    // 나머지가 1일 때 : 1
    // 나머지가 3일 때 : 3
    // 나머지가 5일 때 : 4
    // 나머지가 7일 때 : 5 
    
    //3번 학생 
    // 0 1 2 3 4 5 6 7 8 9 |10
    // 3 3 1 1 2 2 4 4 5 5 | 3 
    // 10으로 나누면 될 것으로 보여진다. 
    
    
    for(int i= 0 ; i< answers.size() ; i++){
        if(answers[i] == i+1){
            a++; 
        }
        
        if(i%2 ==0){
            if (answers[i] == 2){
                b++;
            }
        }else{
            switch(i%8){
                case 1:
                    if(answer[i] == 1) b++; break;
                case 3:
                    if(answer[i] == 3) b++; break;
                case 5:
                    if(answer[i] == 4) b++; break;
                case 7:
                    if(answer[i] == 5) b++; break;
                
            }
        }// b 끝
    
        switch(i%10){
            case 0:
            case 1:
                if(answer[i] == 3) c++; break;
            case 2:
            case 3:
                if(answer[i] == 1) c++; break;
            case 4:
            case 5:
                if(answer[i] == 2) c++; break;
            case 6:
            case 7:
                if(answer[i] == 4) c++; break;
            case 8:
            case 9:
                if(answer[i] == 5) c++; break;
        }
        printf("%d %d %d\n", a,b,c); 
    } // for문 끝.

    
    // answer.push_back(a); 
    // answer.push_back(b); 
    // answer.push_back(c); 
    
    /*
    // 3항 연산자로 굴려야하나. 
    // 다 같은 경우의 처리가..
    if ( a > b){
        if(a > c){
            answer.push_back(1); 
        }else{ // a<= c
            if ( a == c){
                answer.push_back(1); 
            }
            answer.push_back(3); 
        }
    }else if(b > a){ // 
        if(b > c){
            answer.push_back(2); 
        }else{ // b <= c
            if(b == c){
                answer.push_back(2);     
            }
            answer.push_back(3); 
        }
    }else{  // a == b
        if ( a > c){
            answer.push_back(1); 
            answer.push_back(2); 
        }else{
            answer.push_back(3); 
        }
        
    }
    */
    return answer;
}
