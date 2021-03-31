#include<iostream>
#include<vector>
#include<stdio.h>

using namespace std; 

int n  ; 
int check[11] = {0} ; 
void d(int num){

    if ( num > n ){

        //print.. 
        for(int i =1 ; i<= n ; i++){
            if(check[i] != 0){
                printf("%d ", i); 
            }
        }
        printf("\n"); 
    } else{
        check[num] = 1 ; 
        d(num+1) ; 
        check[num] = 0 ; 
        d(num+1); 
    }

}
int main(){

    cin >> n ; 

    d(1); 

    return 0; 

}

/// DFS 부분합.
// check 배열을 전역으로 놓고 
// 넣은 것, 넣지 않은 것을 체크하는 식으로 트리를 만든다. 
