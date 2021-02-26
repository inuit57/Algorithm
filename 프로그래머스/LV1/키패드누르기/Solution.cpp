#include <string>
#include <vector>

using namespace std;

string solution(vector<int> numbers, string hand) {
    string answer = "";
    int left , right ; 
    
    // 0 은 11로 취급. 
    left = 10; 
    right = 12; 
    
    for(int i = 0 ; i< numbers.size() ; i++){
        
        if( numbers[i] == 0 ) numbers[i] = 11; // 0을 11로 바꿔준다. 미리. 
        
        if(left == numbers[i]){ //이미 그 숫자인 경우. 
            answer += 'L' ;
            continue; 
        }else if(right == numbers[i]){
            answer += 'R'; 
            continue; 
        }else{
            // 1, 4, 7 일 때. 
            if(numbers[i]%3 == 1) {
                answer += 'L' ; 
                left = numbers[i] ; //위치는 숫자 값으로 기록.
            }
            else if (( numbers[i] % 3 == 0)){ // && ( numbers[i]!= 0)){
                answer += 'R' ; 
                right = numbers[i] ; 
            }
            else{ // 2,5,8,11 일 때... 
                int l_chk , r_chk; 
                l_chk = r_chk = 0; //혹시 모르니까 초기화. 
                //이거랑 뭔가 관련이 있을 수도 있겠는데 .
                
                switch(numbers[i]){
                    case 2: 
                        // 거리 1 : L(1), M(5), R(3) 
                        // 거리 2 : L(4), M(8), R(6)
                        // 거리 3 : L(7), M(11,), R(9)
                        // 거리 4 : L(10) , R(12) 
                        
                        switch(left){
                            case 1:
                            case 5:
                                l_chk = 1; break;
                            case 4:
                            case 8:
                                l_chk = 2; break;
                            case 7:
                            case 11:
                                l_chk = 3; break;
                            case 10:
                                l_chk = 4; break;
                        }
                        switch(right){
                            case 5:
                            case 3: 
                                r_chk = 1 ; break;
                            case 6:
                            case 8 :
                                r_chk = 2 ; break;
                            case 11:
                            case 9 : 
                                r_chk = 3; break;
                            case 12 :
                                r_chk = 4; break;
                        }
                        break; // 따로 여기에서 작업칠 거는 없다.                       
                        
                    case 5:
                        // 거리 1 : L(4), M(2), M(8), R(6)
                        // 거리 2 : L(1), L(7), M(11), R(3), R(9)
                        // 거리 3 : L(10) , R(12) 
                        
                        switch(left){
                            case 4:
                            case 2:
                            case 8:
                                l_chk =1; 
                                break;
                            case 1:
                            case 7:
                            case 11:
                                l_chk = 2; 
                                break;
                            case 10 :
                                l_chk = 3;
                                break;
                        }
                        switch(right){
                            case 2:
                            case 8 :
                            case 6:
                                r_chk = 1;
                                break;
                            case 11:
                            case 3:
                            case 9:
                                r_chk = 2;
                                break;
                            case 12 :
                                r_chk = 3; 
                                break;
                        }
                        break; 
                    case 8:
                        //거리 1 : L(7), M(5),M(11), R(9)
                        //거리 2 : L(4),L(10), M(2), R(6),R(12) 
                        //거리 3 : L(1), R(3)     
                       
                        switch(left){
                            case 7:
                            case 5:
                            case 11:
                                l_chk = 1;
                                break;
                            case 4:
                            case 10:
                            case 2:
                                l_chk = 2;
                                break;
                            case 1:
                                l_chk = 3; 
                                break;
                        }
                        switch(right){
                            case 5:
                            case 11:
                            case 9 :
                                r_chk = 1;
                                break;
                            case 2:
                            case 6:
                            case 12:
                                r_chk = 2; 
                                break;
                            case 3:
                                r_chk = 3; 
                                break; 
                        }
                        break;
                    case 11: // 0 일 때. 
                        //거리 1 : L(10) ,M(8),  R(12) 
                        //거리 2 : L(7), M(5), R(9) 
                        //거리 3 : L(4), M(2), R(6) 
                        //거리 4 : L(1) , R(3) 
                  
                        switch(left){
                            case 10: //여기가 11로 잘못 적혀있었다.
                            case 8:
                                l_chk = 1;break;
                            case 7:
                            case 5:
                                l_chk = 2; break;
                            case 4:
                            case 2:
                                l_chk = 3; break;
                            case 1:
                                l_chk = 1; 
                                break;
                        }
                        switch(right){
                            case 8:
                            case 12:
                                r_chk = 1; break;
                            case 5:
                            case 9 :
                                r_chk = 2; break;
                            case 2:
                            case 6 : 
                                r_chk = 3; break;
                            case 3:
                                r_chk = 4; break; 
                        }
                        break;
                } // 케이스 문 끝. 
                
//                 printf("now : %d \n", numbers[i]); 
//                 printf("l_chk : %d \n", l_chk); 
//                 printf("r_chk : %d \n", r_chk); 
                
                
                if(l_chk == r_chk){
                    
                    if(hand == "left") {
                      answer +="L"; 
                      left = numbers[i];
                    }
                    else{
                      answer +="R";   
                      right = numbers[i]; 
                    } 
                }else if( l_chk > r_chk){
                    answer += "R"; 
                    right = numbers[i]; 
                }else{
                    answer += "L"; 
                    left = numbers[i]; 
                }

            } //여기가 else 끝... 
        }
    }
    
    return answer;
}
