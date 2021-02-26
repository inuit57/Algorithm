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
            else if (( numbers[i] % 3 == 0) && ( numbers[i]!= 0)){
                answer += 'R' ; 
                right = numbers[i] ; 
            }
            else{ // 2,5,8,0 일 때... 
                // 1) 같은 위치인 경우 : 위에서 처리
                // 2) 둘다 가운데 줄이 아닌 경우 (거리 체크)
                // 2-1) 둘 중 하나가 가운데 줄인 경우 (거리 체크)
                // 4) 같은 거리일 경우의 처리
                int l_chk , r_chk; 
                l_chk = r_chk = 999; //혹시 모르니까 초기화. 
    
                if( numbers[i] == 0 ) numbers[i] = 11; 
                
                //left 처리
                if(left > numbers[i]){
                    l_chk = left - numbers[i] ; 
                }else{
                    l_chk = numbers[i] - left; 
                }
                
                
                if (l_chk %3 ==0 ) {
                    l_chk /=3 ; 
                }else{
                    l_chk %= 3; 
                }
                
                // 2일 때는 ....  1, 3 일 때 차이가 1 
                // 2일 때 5라면 차이가 3.  (거리는 1)
                // 2일 때 8이라면 차이가 6. (거리는 2)
                // 2일 때는 /3 . %3하는게 맞다. (꼭 그런 것도 아닌 듯 싶다... )
                // 
                
                
                
                // 5 일때?
                // 4,6이라면 차이가 1 (거리는 1) %3
                // 2,8이라면 차이가 3 (거리는 1) /3
                // 
                // 10,12 라면 차이가 5, 7 (거리는 3)... %3 하면 2로 나온다. 
                
                // 1,3이라면 차이가 2 (거리는 2) %3해도 괜찮다
                // 7, 9 이라면 차이가 4.(거리는 2) %3하면 안된다. 
                // 11(0)이라면 차이가 6 (거리는 3) %3하면 안된다. 
                // 나누기 2를 하는 것도 좀 그렇네 근데. 
                
                //right 처리
                if( right > numbers[i] ){
                    r_chk = right - numbers[i] ; 
                }else{
                    r_chk = numbers[i] - right; 
                }
                
                
                if (r_chk %3 ==0 ) {
                    r_chk /=3 ; 
                }else{
                    r_chk %= 3; 
                }
                /*
                //left 계산.
                if(left%3 != 2){
                    l_chk = left/3  +1 ; 
                }else{
                    l_chk = left/3 - 1 ; 
                }
                //right 계산. 
                if(right % 3 != 2){
                    r_chk = right/ 3; 
                }else{
                    r_chk = right/3 -1 ; 
                }
                
                
    
                switch(numbers[i]){
                    case 2: 
                        // 거리 1 : L(1), M(5), R(3) 
                        // 거리 2 : L(4), M(8), R(6)
                        // 거리 3 : L(7), M(11,), R(9)
                        // 거리 4 : L(10) , R(12) 
                        
                        // 나누기 3을 하면 대충 견적이 나오나.                                      
                        break; // 따로 여기에서 작업칠 거는 없다.                       
                        
                    case 5:
                        // 거리 1 : L(4), M(2), M(8), R(6)
                        // 거리 2 : L(1), L(7), M(11), R(3), R(9)
                        // 거리 3 : L(10) , R(12) 
                        
                        // 1, 3 -> 2 
                        // 2 -> 1
                        // 4 -> 3... 
                        
                        l_chk --; 
                        r_chk --; 
                        
                        if(l_chk == 0) l_chk =2; 
                        if(r_chk == 0) r_chk =2; 
                        break; 
                    case 8:
                        //거리 1 : L(7), M(5),M(11), R(9)
                        //거리 2 : L(4),L(10), M(2), R(6),R(12) 
                        //거리 3 : L(1), R(3)     
                        
                        //조금 다르다. 

                    case 0:
                        //거리 1 : L(11) ,M(8),  R(12) 
                        //거리 2 : L(7), M(5), R(9) 
                        //거리 3 : L(4), M(2), R(6) 
                        //거리 4 : L(1) , R(3) 

                        //left = 11; 
                        //right = 11; 
                        numbers[i] =11; 
                        
                } // 케이스 문 끝. 
                */ 
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
