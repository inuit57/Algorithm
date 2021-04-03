#include<iostream>
#include<vector>
#include<stdio.h>

using namespace std; 


int main(){
    //freopen("input.txt", "rt", stdin); 

    int n ; 
    cin >>  n; 

    int chk[101]  = {0} ; 

    for(int i = 0 ; i < n; i++){
    
        int idx ; 
        cin >> idx ; 
        

        chk[idx] ++ ; 
    }

    int cnt = 0 ; 

    for(int i = 100 ; i > 0 ; i--){
        if(chk[i] > 0) {
            cnt = cnt + 1;
            if (cnt == 3) {
                cout << i <<endl ; 
                break; 
            } 
        }
    }

  
    return 0; 
   
}

// 3등의 성적구하기
// 성적이 동일한 경우에는 하나의 등수로 본다.
// 예) 98점 - 3명 (1등) , 96점 -2명(2등) , 90점 -5명 (3등)
// 이 경우에는 90점을 출력. 
