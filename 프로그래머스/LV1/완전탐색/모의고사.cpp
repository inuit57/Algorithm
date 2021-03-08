// https://programmers.co.kr/learn/courses/30/lessons/42840
// signal: illegal instruction (core dumped) 에러가 b, c 를 건드리려고 하면 난다. 
// 위의 에러는 answers, answer를 혼용해서 잘못 사용해서 난 에러다. 
#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> answers) {
    vector<int> answer;
    
    int arr[3] = {0}; 
    
    int tmp = 0 ; 
    
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
        
        if(answers[i] == ((i%5)+1) ){
            arr[0]++; 
        }
        
        if(i%2 ==0){
            if (answers[i] == 2){
                arr[1]++;
            }
        }else{
           if(i%8 == 1){
               if(answers[i] == 1) arr[1]++; 
           }else if(i%8 == 3){
               if(answers[i] == 3) arr[1]++;
               
           }else if(i%8 == 5){
               if(answers[i] == 4) arr[1]++; 
           }else if(i%8 == 7){
               if(answers[i] == 5) arr[1]++; 
           }        
        }// b 끝
        
        tmp = i %10 ;
        if( tmp < 2){
             if(answers[i] == 3) arr[2]++; 
        }else if(tmp < 4){
                if(answers[i] == 1) arr[2]++; 
        }else if (tmp <6 ){
                if(answers[i] == 2) arr[2]++; 
        }else if(tmp <8){
                if(answers[i] == 4) arr[2]++; 
        }else{
                if(answers[i] == 5) arr[2]++; 
        }

    } // for문 끝.

 //   printf("%d %d %d\n", a,b,c);
    
    
//     answer.push_back(a); 
//     answer.push_back(b); 
//     answer.push_back(c); 
    int max = -1 ; 
    int who = -1 ; 
    int cnt = 0 ; 
    for(int i = 0 ; i< 3; i++){
        if ( arr[i] >= max){
            max = arr[i] ; 
            who = i ; 
        }
    }
 
    for(int i = 0 ; i< 3; i++){
        if ( arr[i] == max){
            answer.push_back(i+1);  
        }
    }
    
    return answer;
}
